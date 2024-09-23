package com.csc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPayCalculator {

  PayCalculator payCalculator;

  @BeforeEach
  void setUp() {
    payCalculator = new PayCalculator();
  }

  @Test
  void itCalculatesThePayForOneHourWorked() {
    assertEquals(payCalculator.calculateGrossPay(1, 16.78), 16.78, 0.001);
  }

  @Test
  void itCalculatesThePayForFiveHoursWorked() {
    assertEquals(payCalculator.calculateGrossPay(5, 16.78), 83.90, 0.001);
  }

  @Test
  void itCalculatesThePayForTenHoursWorked() {
    assertEquals(payCalculator.calculateGrossPay(10, 16.78), 167.80, 0.001);
  }

  @Test
  void itCalculatesThePayForFifteenHoursWorked() {
    assertEquals(payCalculator.calculateGrossPay(15, 16.78), 251.70, 0.001);
  }

  @Test
  void itCalculatesThePayForTwentyHoursWorked() {
    assertEquals(payCalculator.calculateGrossPay(20, 16.78), 335.60, 0.001);
  }

  @Test
  void itCalculatesThePayForThirtyHoursWorked() {
    assertEquals(payCalculator.calculateGrossPay(30, 16.78), 503.40, 0.001);
  }

  @Test
  void itCalculatesThePayForFortyHoursWorked() {
    assertEquals(payCalculator.calculateGrossPay(40, 16.78), 671.20, 0.001);
  }

  @Test
  void itCalculatesThePayForFortyFiveHoursWorked() {
    assertEquals(payCalculator.calculateGrossPay(45, 16.78), 797.05, 0.001);
  }

  @Test
  void itCalculatesThePayForFiftyHoursWorked() {
    assertEquals(payCalculator.calculateGrossPay(50, 16.78), 922.9, 0.001);
  }
}
