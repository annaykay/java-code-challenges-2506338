package com.linkedinlearning.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DiamondTest {
  
@Test
void renderDiamond(){
  Diamond myDiamond = new Diamond("A");
  assertEquals("A", myDiamond.renderDiamond());

  myDiamond.setLetter("D");
  String expectedDDiamond = """
      A
     B B
    C   C
   D     D
    C   C
     B B
      A""";

  assertEquals(expectedDDiamond, myDiamond.renderDiamond());
}

}
