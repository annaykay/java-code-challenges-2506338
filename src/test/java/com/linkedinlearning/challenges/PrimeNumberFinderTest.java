package com.linkedinlearning.challenges;


import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeNumberFinderTest {
  
  @Test
  void findPrimeNumbersInInterval(){
    
    List<Integer> expected = List.of(11,13,17,19);

    Assertions.assertEquals(expected
    , PrimeNumberFinder.findPrimeNumbersInInterval(10,20));

    expected = List.of(2,3,5,7);
    
    Assertions.assertEquals(expected
    , PrimeNumberFinder.findPrimeNumbersInInterval(1, 10));
  }
}
