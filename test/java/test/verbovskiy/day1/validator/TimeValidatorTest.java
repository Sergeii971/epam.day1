package test.verbovskiy.day1.validator;

import com.verbovskiy.day1.validator.TimeValidator;
import junit.framework.TestCase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TimeValidatorTest extends TestCase {
    TimeValidator timeValidator;

    @BeforeClass
    public void setUp() {
        timeValidator = new TimeValidator();
    }

    @Test
    public void validateMonthPositiveTest() {
        boolean actual = timeValidator.validateMonth(11);
        assertTrue(actual);
    }

    @Test
    public void validateMonthNegativeTest() {
        boolean actual = timeValidator.validateMonth(13);
        assertFalse(actual);
    }

    @Test
    public void validateSecondNumberInDayPositiveTest() {
        boolean actual = timeValidator.validateSecondNumberInDay(60000);
        assertTrue(actual);
    }

    @Test
    public void validateSecondNumberInDayNegativeTest() {
        boolean actual = timeValidator.validateSecondNumberInDay(-2000);
        assertFalse(actual);
    }
}