package tests.junit;

import converter.TemperatureConverter;
//import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


public class TemperatureConverterTests {
    @Test
    public void convert0fToC() throws Exception {
        TemperatureConverter uut = new TemperatureConverter();
        String testInput = "0 F";
        String expectedResult = "from F => C -17.77777777777778";
        String actualResult = uut.getConvertedValue(testInput);

        assertThat(actualResult).isEqualTo(expectedResult);


    }

    @Test
    public void convert0cToF() throws Exception {
        TemperatureConverter uut = new TemperatureConverter();
        String testInput = "0 C";
        String expectedResult = "from C => F 32.0";
        String actualResult = uut.getConvertedValue(testInput);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

}
