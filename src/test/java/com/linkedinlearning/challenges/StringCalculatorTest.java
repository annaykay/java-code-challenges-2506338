package com.linkedinlearning.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
  
  @Test
  void add(){
    assertEquals(0, StringCalculator.add(""));
    assertEquals(1, StringCalculator.add("1"));
    assertEquals(15, StringCalculator.add("1,2,3,4,5"));
    assertEquals(50, StringCalculator.add("42,8"));
  }
}
