package tests.junit;

import converter.TemperatureConverter;
import org.junit.Assert;
import org.junit.Test;

public class TemperatureConverterTests {
    @Test
    public void firstTest() throws Exception {
        TemperatureConverter uut = new TemperatureConverter();
        String testInput = "0 F";
        String expectedResult = "from F => C -17.77777777777778";

        String actualResult =  uut.convert(testInput);
        Assert.assertEquals( expectedResult, actualResult);
    }
}
