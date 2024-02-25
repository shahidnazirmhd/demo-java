/*
0
101
21012
3210123
432101234
 */
package com.snm.demo.patterns;

import java.util.Scanner;

public class PatternDemo2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of rows for pattern: ");
    int rows = scan.nextInt();
    for (int i = 0; i < rows; i++) {
      // Maintaining space
      for (int j = rows - 1; j > i; j--) {
        System.out.print(" ");
      }
      // Decreasing
      for (int j = i; j >= 0; j--) {
        System.out.print(j);
      }
      // Increasing
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      // New line
      System.out.println();
    }
  }
}
