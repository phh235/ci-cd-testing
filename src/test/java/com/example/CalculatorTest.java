package com.example;

import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(calculator.add(2, 3), 5);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calculator.subtract(5, 3), 2);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(calculator.multiply(2, 3), 6);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(calculator.divide(6, 2), 3.0);
    }
}