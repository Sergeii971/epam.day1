package test.verbovskiy.day1.validator;

import com.verbovskiy.day1.validator.ArithmeticValidator;
import junit.framework.TestCase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArithmeticValidatorTest extends TestCase {

    ArithmeticValidator arithmeticValidator;
    @BeforeClass
    public void setUp() {
        arithmeticValidator = new ArithmeticValidator();
    }

    @Test
    public void isIntPositiveTest() {
        boolean actual = arithmeticValidator.isInt("10");
        assertTrue(actual);
    }

    @Test
    public void isIntNegativeTest() {
        boolean actual = arithmeticValidator.isInt("123xv");
        assertFalse(actual);
    }

    @Test
    public void isDoublePositiveTest() {
        boolean actual = arithmeticValidator.isDouble("10.23");
        assertTrue(actual);
    }

    @Test
    public void isDoubleNegativeTest() {
        boolean actual = arithmeticValidator.isDouble("10.23sd");
        assertFalse(actual);
    }

    @Test
    public void validateNumberCountPositiveTest() {
        boolean actual = arithmeticValidator.validateNumberCount(2, 3, 4, 5);
        assertTrue(actual);
    }

    @Test
    public void validateNumberCountNegativeTest() {
        boolean actual = arithmeticValidator.validateNumberCount(2, 3, 4, 5, 6);
        assertFalse(actual);
    }
}