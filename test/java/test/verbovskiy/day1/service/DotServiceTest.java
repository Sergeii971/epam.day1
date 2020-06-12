package test.verbovskiy.day1.service;

import com.verbovskiy.day1.entity.Dot;
import com.verbovskiy.day1.exception.TaskException;
import com.verbovskiy.day1.service.DotService;
import junit.framework.TestCase;
import org.testng.annotations.*;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertNotEquals;

public class DotServiceTest extends TestCase {
    DotService dotService;

    @BeforeClass
    public void setUp() {
        dotService = new DotService();
    }

    @DataProvider(name = "dataForClosestDotPositive")
    @Test
    public Object[][] dataForClosestPointPositive() {
        return new Object[][]{
                {new Dot(0, -4), new Dot(4, 9), -1},
                {new Dot(-4, -5), new Dot(-2, -3), 1},
                {new Dot(5, 5), new Dot(-5, -5), 0}
        };
    }

    @Parameters({"firstDot", "secondDot", "expectedResult"})
    @Test (dataProvider = "dataForClosestDotPositive")
    public void calculateClosestDotPositiveTest(Dot firstDot, Dot secondDot, int expectedResult) {
        int actualResult = dotService.calculateClosestDot(firstDot, secondDot);
        assertEquals(actualResult, expectedResult);
    }

    @DataProvider(name = "dataForClosestDotNegative")
    @Test
    public Object[][] dataForClosestPoint() {
        return new Object[][]{
                {new Dot(4, -9), new Dot(5, 0), -1},
                {new Dot(-2, -3), new Dot(6, -7), 1},
                {new Dot(4, 5), new Dot(-5, -5), 0}
        };
    }

    @Parameters({"firstDot", "secondDot", "expectedResult"})
    @Test (dataProvider = "dataForClosestDotNegative")
    public void calculateClosestDotNegativeTest(Dot firstDot, Dot secondDot, int expectedResult) {
        int actualResult = dotService.calculateClosestDot(firstDot, secondDot);
        assertNotEquals(actualResult, expectedResult);
    }

    @Test
    public void calculateDistancePositiveTest() {
        double actual = dotService.calculateDistance(3, 4);
        double expected = 5;
        assertEquals(actual, expected, 0.001);
    }

    @Test
    public void calculateDistanceNegativeTest() {
        double actual = dotService.calculateDistance(3, 4);
        double expected = 6;
        assertNotEquals(actual, expected, 0.001);
    }

    @Test
    public void calculateFunctionValuePositiveTest() {
        double actual = dotService.calculateFunctionValue(3);
        double expected = 9;
        assertEquals(actual, expected, 0.001);
    }

    @Test
    public void calculateFunctionValueNegativeTest() {
        double actual = dotService.calculateFunctionValue(3);
        double expected = 10;
        assertNotEquals(actual, expected, 0.001);
    }
    
    @Test
    public void calculateTangentFunctionPositiveTest() {
        try {
        Map<Double, Double> actual = dotService.calculateTangentFunction(0,4,2);
        Map<Double, Double> expected = new HashMap<>();
        expected.put(0.0, 0.0);
        expected.put(2.0, Math.tan(2));
        expected.put(4.0, Math.tan(4));
        assertEquals(actual, expected);
         } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void calculateTangentFunctionNegativeTest() {
        try {
            Map<Double, Double> actual = dotService.calculateTangentFunction(0,4,2);
            Map<Double, Double> expected = new HashMap<>();
            expected.put(0.0, 0.0);
            expected.put(3.0, Math.tan(2));
            expected.put(4.0, Math.tan(4));
            assertNotEquals(actual, expected);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = TaskException.class)
    public void calculateTangentFunctionExceptionTest () throws TaskException {
        dotService.calculateTangentFunction(0,4,5);
    }
}