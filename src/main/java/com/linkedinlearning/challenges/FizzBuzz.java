package com.linkedinlearning.challenges;

public class FizzBuzz {

  public static String fizzBuzzUntil(int number){
    String returnString = "";
      for (int i = 1; i <= number; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
          returnString += "FizzBuzz";
        } else if(i % 3 == 0){
          returnString += "Fizz";
        } else if(i % 5 == 0){
          returnString += "Buzz";
        } else {
          returnString += i;
        }
        returnString += "\n";
      }
      return returnString;
  }

  public static void main(String[] args) {
    System.out.println(FizzBuzz.fizzBuzzUntil(15));

  }
}
