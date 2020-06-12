package test.verbovskiy.day1.service;

import com.verbovskiy.day1.exception.TaskException;
import com.verbovskiy.day1.service.ShapeService;
import junit.framework.TestCase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;

public class ShapeServiceTest extends TestCase {
    ShapeService shapeService;
    @BeforeClass
    public void setUp() {
        shapeService = new ShapeService();
    }

    @Test
    public void calculateSquareSidePositiveTest() {
        try {
            double actual = shapeService.calculateSquareSide(4);
            double expected = 2;
            assertEquals(actual, expected, 0.001);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateSquareSideNegativeTest() {
        try {
            double actual = shapeService.calculateSquareSide(4);
            double expected = 3;
            assertNotEquals(actual, expected, 0.001);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = TaskException.class)
    public void calculateSquareSideExceptionTest () throws TaskException {
        shapeService.calculateSquareSide(-4);
    }

    @Test
    public void calculateInscribedSquareSidePositiveTest() {
        try {
            double actual = shapeService.calculateInscribedSquareSide(0);
            double expected = 0;
            assertEquals(actual, expected, 0.001);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateInscribedSquareSideNegativeTest() {
        try {
        double actual = shapeService.calculateInscribedSquareSide(0);
        double expected = 1;
        assertNotEquals(actual, expected, 0.001);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = TaskException.class)
    public void calculateInscribedSquareSideExceptionTest () throws TaskException {
        shapeService.calculateInscribedSquareSide(-4);
    }

    @Test
    public void calculateSquareAreaPositiveTest() {
        try {
        double actual = shapeService.calculateSquareArea(3);
        double expected = 9;
        assertEquals(actual, expected, 0.001);
        } catch (TaskException e) {
        fail(e.getMessage());
        }
    }

    @Test
    public void calculateSquareAreaNegativeTest() {
        try {
        double actual = shapeService.calculateSquareArea(3);
        double expected = 10;
        assertNotEquals(actual, expected, 0.001);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = TaskException.class)
    public void calculateSquareAreaExceptionTest () throws TaskException {
        shapeService.calculateSquareArea(-5);
    }

    @Test
    public void calculateAreaRatioPositiveTest() {
        try {
        double actual = shapeService.calculateAreaRatio(10, 5);
        double expected = 2;
        assertEquals(actual, expected, 0.001);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateAreaRatioNegativeTest() {
        try {
        double actual = shapeService.calculateAreaRatio(10, 5);
        double expected = 2.2;
        assertNotEquals(actual, expected, 0.001);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = TaskException.class)
    public void calculateAreaRatioExceptionTest () throws TaskException {
        shapeService.calculateAreaRatio(-4, -5);
    }

    @Test
    public void calculateCircleAreaPositiveTest() {
        try {
        double actual = shapeService.calculateCircleArea(2);
        double expected = 4 * Math.PI;
        assertEquals(actual, expected, 0.001);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateCircleAreaNegativeTest() {
        try {
        double actual = shapeService.calculateCircleArea(2);
        double expected = 5 * Math.PI;
        assertNotEquals(actual, expected, 0.001);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = TaskException.class)
    public void calculateCircleAreaExceptionTest () throws TaskException {
        shapeService.calculateCircleArea(-5);
    }

    @Test
    public void calculateCircumferencePositiveTest() {
        try {
        double actual = shapeService.calculateCircumference(3);
        double expected = 6 * Math.PI;
        assertEquals(actual, expected, 0.001);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateCircumferenceNegativeTest() {
        try {
        double actual = shapeService.calculateCircumference(3);
        double expected = 7 * Math.PI;
        assertNotEquals(actual, expected, 0.001);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = TaskException.class)
    public void calculateCircumferenceExceptionTest () throws TaskException {
        shapeService.calculateCircleArea(-5);
    }
}