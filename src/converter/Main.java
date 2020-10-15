package converter;

import converter.TemperatureConverter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
      TemperatureConverter converter = new TemperatureConverter();


     String userInput = TemperatureConverter.getTemperatureFromInput();

     converter.convert(userInput);
    }
}
