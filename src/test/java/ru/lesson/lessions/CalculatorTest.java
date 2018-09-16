package ru.lesson.lessions;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        calculator.sum(1, 1);
        assertEquals(2, calculator.getResult());
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        calculator.division(1, 1);
        assertEquals(1, calculator.getResult());
    }
}