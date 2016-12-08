import org.junit.Assert;
import org.junit.Test;


public class MonthTest {

    @Test
    public void getDayCountOfFebruary() throws Exception {
        Assert.assertTrue(Month.FEBRUARY.getDayCount() == 28);
    }

    @Test
    public void getDayCountOfMay() throws Exception {
        Assert.assertTrue(Month.MAY.getDayCount() == 31);
    }

    @Test
    public void testGetNextMonthInMiddleYear() throws Exception {
        Month april = Month.APRIL;
        Month may = Month.MAY;
        Assert.assertTrue(april.getNextMonth() == may);
    }

    @Test
    public void testGetNextMonthInEndYear() throws Exception {
        Month december = Month.DECEMBER;
        Month january = Month.JANUARY;
        Assert.assertTrue(december.getNextMonth() == january);
    }
}