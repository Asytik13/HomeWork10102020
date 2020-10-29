package converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureConverter {
static String inputByUserTemperature;
    boolean splitInputIsCelsius;
    int userTemperature;

    static String getTemperatureFromInput() throws IOException {
        System.out.println( "Provide temperature and after blank space specify 'C' for Celsius or 'F' for Fahrenheit" );
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        inputByUserTemperature = reader.readLine();

        return inputByUserTemperature;
    }

   public String getConvertedValue(String inputByUserTemperature) throws Exception {
       String calculatedResult;
       double temperature = getParsedTemperature(inputByUserTemperature);
       if (getTypeOfTemperature(inputByUserTemperature))
       {
           calculatedResult  = cToF( temperature );
       }
       else
       {
           calculatedResult = fToC( temperature );
       }
       return  calculatedResult;
   }

   String cToF(double temperature)
   {
       double result = (temperature * 1.8) + 32;
       String calculatedResultFarenheit = "from C => F " +  result;

       return calculatedResultFarenheit;
   }

    String fToC(double temperature)
    {
        double result = (temperature - 32)/1.8;
        String calculatedResultCelsius = "from F => C " +  result;

        return calculatedResultCelsius;
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
