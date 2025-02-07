package com.linkedinlearning.challenges;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFinder {
  

  public static List<Integer> findPrimeNumbersInInterval(int start, int end){

    List<Integer> primeNumbers = new ArrayList<Integer>();

    for (int i = start ; i <= end; i++) {
      if(isPrimeNumber(i)) {
        primeNumbers.add(i);
      }
    }

    return primeNumbers;
  }

  private static boolean isPrimeNumber(int number){
    if(number < 2){
      return false;
    }
    for (int i = 2; i < (number/2) + 1; i++) {
        if (number % i == 0){
          return false;
        }
    }
      return true;
  }

  public static void main(String[] args) {
    System.out.println(findPrimeNumbersInInterval(1, 20));
  }
}
