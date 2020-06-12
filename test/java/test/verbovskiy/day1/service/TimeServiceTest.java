package test.verbovskiy.day1.service;

import com.verbovskiy.day1.exception.TaskException;
import com.verbovskiy.day1.service.TimeService;
import junit.framework.TestCase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalTime;

import static org.testng.Assert.assertNotEquals;

public class TimeServiceTest extends TestCase {
    TimeService timeService;

    @BeforeClass
    public void setUp() {
        timeService = new TimeService();
    }

    @Test
    public void calculateLengthOfMonthPositiveTest() {
        try {
            int actual = timeService.calculateLengthOfMonth(2000, 2);
            int expected = 29;
            assertEquals(actual, expected);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateLengthOfMonthNegativeTest() {
        try {
        int actual = timeService.calculateLengthOfMonth(2000, 2);
        int expected = 28;
        assertNotEquals(actual, expected);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = TaskException.class)
    public void calculateLengthOfMonthExceptionTest () throws TaskException {
        timeService.calculateLengthOfMonth(-1, 13);
    }

    @Test
    public void isLeapYearPositiveTest() {
        try {
        boolean actual = timeService.isLeapYear(2000);
        assertTrue(actual);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void isLeapYearNegativeTest() {
        try {
        boolean actual = timeService.isLeapYear(2001);
        assertFalse(actual);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = TaskException.class)
    public void isLeapYearExceptionTest () throws TaskException {
        timeService.calculateLengthOfMonth(-1, 13);
    }

    @Test
    public void calculateLocalTimePositiveTest() {
        try {
        LocalTime actual = timeService.calculateLocalTime(7263);
        LocalTime expected = LocalTime.of(2,1,3);
        assertEquals(actual,expected);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateLocalTimeNegativeTest() {
        try {
        LocalTime actual = timeService.calculateLocalTime(7263);
        LocalTime expected = LocalTime.of(2,50,3);
           assertNotEquals(actual,expected);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = TaskException.class)
    public void calculateLocalTimeExceptionTest () throws TaskException {
        timeService.calculateLocalTime(90000);
    }
}