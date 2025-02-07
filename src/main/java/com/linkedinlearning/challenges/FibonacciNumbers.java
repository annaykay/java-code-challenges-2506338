package com.linkedinlearning.challenges;

public class FibonacciNumbers {
  
  public static int fibonacci(int n){
    if(n == 0){
      return 0;
    } else if(n == 1){
      return 1;
    } else {
      return fibonacci(n-1) + fibonacci(n-2);
    }
    // int fibonacci = 0;
    // int result = 1;
    // int placeholder;

    // for (int i = 1; i < n ; i++) {
    //   placeholder  = result;
    //   result += fibonacci;
    //   fibonacci = placeholder;
    // }

    // return result;
  }


}
