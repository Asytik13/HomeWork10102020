package converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureConverter {
static String inputByUserTemperature;
    boolean splitInputIsCelsius;
    int userTemperature;

  static String getTemperatureFromInput() throws IOException {
      System.out.println("Provide temperature and after blank space specify 'C' for Celsius or 'F' for Fahrenheit");
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       return inputByUserTemperature = reader.readLine();
   }

   void convert(String inputByUserTemperature) throws Exception {
       double result;
       double temperature = getParsedTemperature(inputByUserTemperature);
       if (getTypeOfTemperature(inputByUserTemperature) == true)
       {
           result = (temperature * 1.8) + 32;
           System.out.println("from C => F " +  result);
       }
       else
       {
          result = (temperature - 32)/1.8;
           System.out.println("from F => C " +  result);
       }
   }

   boolean getTypeOfTemperature (String inputByUserTemperature) throws Exception {
       if ((inputByUserTemperature != null) && (inputByUserTemperature.length() > 0)) {

           String[] splitInput = inputByUserTemperature.split("");
           String temperatureType = splitInput[splitInput.length - 1];

           if ((temperatureType != null) && temperatureType.equalsIgnoreCase("C"))
               splitInputIsCelsius = true;

           else if ((temperatureType != null) && temperatureType.equalsIgnoreCase("F"))
               splitInputIsCelsius = false;
           else {
               System.out.println("You entered wrong type of temperature!!!");
               throw new Exception();
           }
       }

       return splitInputIsCelsius;
   }

   int getParsedTemperature(String inputByUserTemperature) {
       if ((inputByUserTemperature != null) && (inputByUserTemperature.length() > 0)) {
           String temperatureValue = inputByUserTemperature.substring(0, inputByUserTemperature.length() - 1);
           String finalTemperature = temperatureValue.trim();

           userTemperature = Integer.parseInt(finalTemperature);
       }
       return userTemperature;
   }
}
