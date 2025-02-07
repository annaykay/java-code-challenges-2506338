package com.linkedinlearning.challenges;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmeticMeanTest {
  
  @Test
  void mean(){
    List<Integer> numbers = Arrays.asList(1,2,3,4);
    double expected = 2.5;

    Assertions.assertEquals(expected, ArithmeticMean.mean(numbers));

    numbers = Arrays.asList(1, 2, 3, 5, 6, 1, 2, 5, 6);
    expected = 3.44;

    Assertions.assertEquals(expected, ArithmeticMean.mean(numbers),0.01);
  }
}
