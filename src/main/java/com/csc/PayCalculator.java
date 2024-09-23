package com.csc;

public class PayCalculator {
    public double calculateGrossPay(double hours, double rate) {
        if(hours > 40) {
          return 40 * rate + 1.5 * rate * (hours % 40);
        }
        else {
          return hours * rate;
        }
      }
    
      public double calculateNetPay(double grossPay, int dependents) {
        if(dependents > 3) {
        return grossPay - grossPay*0.06 - grossPay * 0.14 - grossPay*0.05 - 10 - 35;
        }
        else {
          return grossPay - grossPay*0.06 - grossPay*0.14 - grossPay*0.05 - 10 - 15;
        }
      }
}
