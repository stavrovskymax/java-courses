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
    public void testDivision() throws UserException {
        Calculator calculator = new Calculator();
        calculator.division(1, 1);
        assertEquals(1, calculator.getResult());
    }

    @Test(expected = UserException.class)
    public void divisionException() throws UserException {
        Calculator calculator = new Calculator();
        calculator.division();
        // Test don't go to next parameters, because calculator throws the error
//        assertEquals(1, calculator.getResult());
    }

    @Test(expected = IllegalArgumentException.class)
    public void divisionRuntimeException() throws UserException {
        Calculator calculator = new Calculator();
        calculator.division(1, 0);
//        assertEquals(1, calculator.getResult());
    }
}