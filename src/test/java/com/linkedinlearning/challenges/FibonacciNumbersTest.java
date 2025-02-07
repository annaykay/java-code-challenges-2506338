package com.linkedinlearning.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FibonacciNumbersTest {
  
  @Test
  void fibonacciTest(){
    assertEquals(0, FibonacciNumbers.fibonacci(0));
    assertEquals(1, FibonacciNumbers.fibonacci(1));
    assertEquals(1, FibonacciNumbers.fibonacci(2));
    assertEquals(144, FibonacciNumbers.fibonacci(12));
  }

}
