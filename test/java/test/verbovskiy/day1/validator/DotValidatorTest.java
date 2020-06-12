package test.verbovskiy.day1.validator;

import com.verbovskiy.day1.validator.DotValidator;
import junit.framework.TestCase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DotValidatorTest extends TestCase {
    DotValidator dotValidator;

    @BeforeClass
    public void setUp() {
        dotValidator = new DotValidator();
    }

    @Test
    public void validateStepPositiveTest() {
        boolean actual = dotValidator.validateStep(0, 4, 3);
        assertTrue(actual);
    }

    @Test
    public void validateStepNegativeTest() {
        boolean actual = dotValidator.validateStep(0, 4, 7);
        assertFalse(actual);
    }
}