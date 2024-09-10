package com.csc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPayDeductions {

  PayDeductions payDeductions;

  @BeforeEach
  void setUp() {
    payDeductions = new PayDeductions();
  }

  // Federal Tax Tests
  @Test
  void itCalculatesTheFedTaxForZeroHoursWorked() {
    assertEquals(payDeductions.calculateFedTax(0), 0);
  }

  @Test
  void itCalculatesTheFedTaxForOneHoursWorked() {
    assertEquals(payDeductions.calculateFedTax(16.78), 2.3492, 0.001);
  }

  @Test
  void itCalculatesTheFedTaxForFiveHoursWorked() {
    assertEquals(payDeductions.calculateFedTax(83.9), 11.746, 0.001);
  }

  @Test
  void itCalculatesTheFedTaxForFortyHoursWorked() {
    assertEquals(payDeductions.calculateFedTax(671.2), 93.968, 0.001);
  }

  // Social Security Tax Tests
  @Test
  void itCalculatesTheSocSecTaxForZeroHoursWorked() {
    assertEquals(payDeductions.calculateSocSec(0), 0);
  }

  @Test
  void itCalculatesTheSocSecTaxForOneHoursWorked() {
    assertEquals(payDeductions.calculateSocSec(16.78), 1.0068, 0.001);
  }

  @Test
  void itCalculatesTheSocSecTaxForFiveHoursWorked() {
    assertEquals(payDeductions.calculateSocSec(83.9), 5.034, 0.001);
  }

  @Test
  void itCalculatesTheSocSecTaxForFortyHoursWorked() {
    assertEquals(payDeductions.calculateSocSec(671.2), 40.272, 0.001);
  }

  // State Tax Tests
  @Test
  void itCalculatesTheStTaxForZeroHoursWorked() {
    assertEquals(payDeductions.calculateStTax(0), 0);
  }

  @Test
  void itCalculatesTheStTaxForOneHoursWorked() {
    assertEquals(payDeductions.calculateStTax(16.78), 0.839, 0.001);
  }

  @Test
  void itCalculatesTheStTaxForFiveHoursWorked() {
    assertEquals(payDeductions.calculateStTax(83.9), 4.195, 0.001);
  }

  @Test
  void itCalculatesTheStTaxForFortyHoursWorked() {
    assertEquals(payDeductions.calculateStTax(671.2), 33.56, 0.001);
  }
}
