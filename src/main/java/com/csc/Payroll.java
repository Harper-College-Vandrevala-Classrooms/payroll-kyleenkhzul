package com.csc;

import java.util.Scanner;

public class Payroll {

  static PayCalculator payCalculator = new PayCalculator();

  // Driver Program
  public static void main(String[] args) {
    double rate = 16.78;
    double unionFee = 10.00;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to the Payroll Calculation Program\n");
    System.out.println("How many hours did you work this week? ");
    double hours = scanner.nextInt();
    System.out.println("How many dependents do you have? ");
    int dependents = scanner.nextInt();

    scanner.close();

    double grossPay = payCalculator.calculateGrossPay(hours);
    double netPay = payCalculator.calculateNetPay(grossPay, dependents);

    System.out.println("Payroll Stub: ");
    System.out.println("\n\tHours: \t" + String.format("%.2f ", hours));
    System.out.println("\tRate: \t" + rate + " $/hr");
    System.out.println("\tGross: \t$ " + String.format("%.2f ", grossPay));
    System.out.println("\n\tSocSec: $ " + String.format("%.2f ", grossPay*0.06));
    System.out.println("\tFedTax: $ " + String.format("%.2f ", grossPay*0.14));
    System.out.println("\tStTax: \t$ " + String.format("%.2f ", grossPay*0.05));
    System.out.println("\tUnion: \t$ " + String.format("%.2f ", unionFee));
    System.out.println("\n\tNet: \t$ " + String.format("%.2f ", netPay));
    System.out.println("\nThank you for using the Payroll Program");
  }
}
