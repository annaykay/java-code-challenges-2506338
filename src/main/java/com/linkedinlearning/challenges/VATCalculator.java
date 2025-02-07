package com.linkedinlearning.challenges;

public class VATCalculator {

  private double vat;
  private String currencySymbol;

  public VATCalculator(double vat, String currencySymbol) {
    this.vat = vat;
    this.currencySymbol = currencySymbol;
  }

  public String renderInvoice(double price){
    
    var vatAmount = calculateVAT(price);
    var total = price + vatAmount;

    return """
        Netto: %.2f%s
        VAT (%.2f): %.2f%s
        Total: %.2f%s
        """.formatted(price, currencySymbol
        , vat, vatAmount, currencySymbol
        , total, currencySymbol);
  }

  private double calculateVAT(double price){
    return price * vat;
  }

  public static void main(String[] args) {

    double nettoPrice = 100;
    VATCalculator myVatCalculator = new VATCalculator(0.16, "€");

    System.out.println(myVatCalculator.renderInvoice(nettoPrice));
  }

}
