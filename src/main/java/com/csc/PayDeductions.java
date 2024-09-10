package com.csc;

public class PayDeductions {
    public double calculateSocSec(double grossPay) {
        return grossPay * 0.06;
    }
    public double calculateFedTax(double grossPay) {
        return grossPay * 0.14;
    }
    public double calculateStTax(double grossPay) {
        return grossPay * 0.05;
    }
}
