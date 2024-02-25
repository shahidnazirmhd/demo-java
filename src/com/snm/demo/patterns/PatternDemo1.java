/*
Look and say pattern
 */
package com.snm.demo.patterns;

import java.util.Scanner;

public class PatternDemo1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of iteration: ");
    int iteration = scan.nextInt();
    String sequence = "1";
    for (int i = 0; i < iteration; i++) {
      System.out.println(sequence);
      sequence = generateNextSequence(sequence);
    }
  }

  private static String generateNextSequence(String sequence) {
    String nextSequenceBuilder = "";
    int count = 1;
    char currentChar = sequence.charAt(0);
    for (int i = 1; i < sequence.length(); i++) {
      if (sequence.charAt(i) == currentChar) {
        count++;
      } else {
        nextSequenceBuilder += count + "" + currentChar;
        count = 1;
        currentChar = sequence.charAt(i);
      }
    }
    return nextSequenceBuilder += count + "" + currentChar;
  }
}
