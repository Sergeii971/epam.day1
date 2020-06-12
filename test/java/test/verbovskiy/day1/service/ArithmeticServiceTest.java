package test.verbovskiy.day1.service;

import com.verbovskiy.day1.exception.TaskException;
import com.verbovskiy.day1.service.ArithmeticService;
import junit.framework.TestCase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;

public class ArithmeticServiceTest extends TestCase {
    ArithmeticService arithmeticService;

    @BeforeClass
    public void setUp() {
        arithmeticService = new ArithmeticService();
    }

    @Test
    public void getLastDigitSquarePositiveTest() {
        int actual = arithmeticService.calculateLastDigitSquare(26.4);
        int expected = 6;
        assertEquals(actual, expected);
    }

    @Test
    public void getLastDigitSquareNegativeTest() {
        int actual = arithmeticService.calculateLastDigitSquare(26.4);
        int expected = 8;
        assertNotEquals(actual, expected);
    }

    @Test
    public void calculateLastDigitPositiveTest() {
        int actual = arithmeticService.calculateLastDigit(26.4);
        int expected = 4;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateLastDigitNegativeTest() {
        int actual = arithmeticService.calculateLastDigit(26.4);
        int expected = 6;
        assertNotEquals(actual, expected);
    }

    @Test
    public void isTwoEvenNumberPositiveTest() {
        try {
            boolean actual = arithmeticService.isTwoEvenNumber(2, 3, 4, 5);
            assertTrue(actual);
        } catch (TaskException e) {
           fail(e.getMessage());
        }
     }

    @Test
    public void isTwoEvenNumberNegativeTest() {
        try {
            boolean actual = arithmeticService.isTwoEvenNumber(2, 3, 5, 7);
            assertFalse(actual);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = TaskException.class)
    public void isTwoEvenNumberExceptionTest () throws TaskException {
        arithmeticService.isTwoEvenNumber(2, 3, 4, 5, 6);
    }

    @Test
    public void isPerfectPositiveTest() {
        boolean actual = arithmeticService.isPerfect(6);
        assertTrue(actual);
    }

    @Test
    public void isPerfectNegativeTest() {
        boolean actual = arithmeticService.isPerfect(8);
        assertFalse(actual);
    }

    @Test
    public void calculateDividerSumPositiveTest() {
        int actual = arithmeticService.calculateDividerSum(6);
        int expected = 6;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateDividerSumNegativeTest() {
        int actual = arithmeticService.calculateDividerSum(6);
        int expected = 5;
        assertNotEquals(actual, expected);
    }
}