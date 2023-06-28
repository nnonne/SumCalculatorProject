import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SumCalculatorTests {
    private SumCalculator sumCalculator;

    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testThatSumWorksCorrectForOne() {
        Assertions.assertEquals(1, new SumCalculator().sum(1));
    }

    @Test
    public void testThatSumWorksCorrectForThree() {
        Assertions.assertEquals(6, new SumCalculator().sum(3));
    }

    @Test
    public void testThatSumWorksCorrectForZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}
