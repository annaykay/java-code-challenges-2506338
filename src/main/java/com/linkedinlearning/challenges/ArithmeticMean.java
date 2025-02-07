package com.linkedinlearning.challenges;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArithmeticMean {
  
  public static double mean(Collection<Integer> numbers){
    double mean = (double) sum(numbers)/numbers.size();
    return mean;
  }
    
  private static int sum(Collection<Integer> numbers){
    int sum = 0;
    for (Integer integer : numbers) {
      sum += integer;
    }
    return sum;
  }

  public static double meanWithStream(Collection<Integer> numbers){
    return numbers.stream()
      .mapToInt(Integer::intValue)
      .average()
      .orElse(0.0);
  }

  public static void main(String[] args) {
    
    List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 6, 1, 2, 5, 6);
    System.out.println(numbers.size());
    System.out.println(sum(numbers));
    System.out.println("Mean: "+mean(numbers));
    System.out.println("Mean (with stream): " + meanWithStream(numbers));
  }

}
