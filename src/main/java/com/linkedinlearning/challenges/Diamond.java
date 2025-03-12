package com.linkedinlearning.challenges;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Diamond {

  List<String> alphabet = IntStream.rangeClosed('A', 'Z')
      .boxed()
      .map(Character::toChars)
      .map(String::valueOf)
      .toList();
  private String letter;

  public Diamond(String letter) {
    this.letter = letter.toUpperCase();
  }

  public String renderDiamondWrong() {
    if (this.letter.equals("A")) {
      return "A";
    }
    String line;
    int p = getAlphabetPosition(letter);
    String diamondString = spaces(p) + "A" + "\n";
    int middleSpace = 1;
    for (int i = 1; i < p; i++) {
      line = spaces(p - i) + alphabet.get(i) + spaces(middleSpace) + alphabet.get(i) + "\n";
      middleSpace += 2;
      diamondString += line;
    }
    for (int i = p - 2; i >= 1; i--) {
      middleSpace -= 2;
      line = spaces(1) + spaces(p - i - 1) + alphabet.get(i) + spaces(middleSpace - 2) + alphabet.get(i) + "\n";
      diamondString += line;
    }
    diamondString += spaces(p) + "A";
    return diamondString;
  }

  public String renderDiamond() {
    List<String> diamondRows = createDiamondHalf();    
    List<String> mirroredRows = mirrorRows(diamondRows);
    
    diamondRows.addAll(mirroredRows);

    return String.join("\n", diamondRows);
  }

  private List<String> mirrorRows(List<String> rows) {
    var mirroredRows = new ArrayList<String>(rows);
    Collections.reverse(mirroredRows);
    mirroredRows.remove(0);
    return mirroredRows;
  }

  private List<String> createDiamondHalf(){
    
    int p = getAlphabetPosition(letter);
    List<String> diamondString = new ArrayList<String>();
    diamondString.add(spaces(p-1) +"A");
    int middleSpace = 1;
    String line;
    for (int i = 1; i < p; i++) {
      line = spaces(p - i - 1) + alphabet.get(i) + spaces(middleSpace) + alphabet.get(i);
      middleSpace += 2;
      diamondString.add(line);
    }
    return diamondString;
  }

  public void setLetter(String newLetter) {
    this.letter = newLetter;
  }

  public static void main(String[] args) {
    Diamond myDiamond = new Diamond("D");

    System.out.println(myDiamond.renderDiamond());

    myDiamond.setLetter("A");

    System.out.println(myDiamond.renderDiamond());
  }

  public static int getAlphabetPosition(String l) {
    return l.toUpperCase().charAt(0) - 'A' + 1;
  }

  private static String spaces(int n) {
    if (n==0){
      return "";
    }
    return String.format("%" + n + "s", "");
  }

}
