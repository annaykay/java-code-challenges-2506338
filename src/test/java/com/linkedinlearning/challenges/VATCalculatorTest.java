package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VATCalculatorTest {
  

  @Test
  void renderInvoiceTest(){
    
    var VATCalculator = new VATCalculator(0.19, "€");
    var nettoPrice = 100;
    var expected = """
          Netto: 100.00€ 
          VAT (0.19): 19.00€
          Total: 119.00€
          """;

    Assertions.assertEquals(expected, VATCalculator.renderInvoice(nettoPrice));
  }

}
