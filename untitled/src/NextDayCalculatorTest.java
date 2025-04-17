import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayCalculatorTest {

    @Test
    public void testCase_31_1_2016() {
        int day = 31;
        int month = 1;
        int year = 2016;
        String expected = "1/2/2016";
        String actual = NextDayCalculator.getDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase_28_2_2018() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1/3/2018";
        String actual = NextDayCalculator.getDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase_29_2_2020() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1/3/2020";
        String actual = NextDayCalculator.getDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase_31_12_2018() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1/1/2019";
        String actual = NextDayCalculator.getDay(day, month, year);
        assertEquals(expected, actual);
    }
}
