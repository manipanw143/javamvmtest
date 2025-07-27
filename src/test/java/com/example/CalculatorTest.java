package com.example;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        Assert.assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        Assert.assertEquals(5, calc.subtract(10, 5));
    }
}
