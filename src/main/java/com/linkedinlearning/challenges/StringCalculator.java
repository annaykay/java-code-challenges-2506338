package com.linkedinlearning.challenges;

import java.util.Arrays;

public class StringCalculator {
  
  public static int add(String numbers){
    if (numbers.isEmpty()) {
      return 0;
    }
    return Arrays.asList(numbers.split(","))
      .stream()
      .mapToInt(Integer::parseInt)
      .sum();         
  }

}
