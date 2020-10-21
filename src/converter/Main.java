package converter;

public class Main {
    public static void main(String[] args) throws Exception {
      TemperatureConverter converter = new TemperatureConverter();
      String userInput = TemperatureConverter.getTemperatureFromInput();

        System.out.println(converter.getConvertedValue( userInput));
    }
}
