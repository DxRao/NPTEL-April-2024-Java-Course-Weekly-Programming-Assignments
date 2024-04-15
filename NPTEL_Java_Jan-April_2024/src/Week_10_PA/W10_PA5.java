package Week_10_PA;

import java.util.Scanner;

class TemperatureException extends Exception {
    
	public TemperatureException(String message) {
        
		super(message);
    }
}

class TemperatureConverter {
	
	//Code to create two function for temperature conversion (celsiusToFahrenheit and fahrenheitToCelsius).

	public static double celsiusToFahrenheit(double celsius)throws TemperatureException{
  
  		double fahrenheit = 0.0;      
      
      	if(celsius < -273.15){
          
          	throw new TemperatureException("Invalid Celsius temperature (below absolute zero)");        
      	}        
      	else{
  
  			fahrenheit = (celsius * 9 / 5) + 32;          
        }
      
      return fahrenheit;   
	}

	public static double fahrenheitToCelsius(double fahrenheit)throws TemperatureException{
  
  		double celsius = 0.0;  		
      
      	if(fahrenheit < -459.67){
          
          	throw new TemperatureException("Invalid Fahrenheit temperature (below absolute zero)");        
      	}
      	else{
          
         	celsius = (fahrenheit - 32) * 5 / 9;           
      	}
      
      	return celsius;   
	}
}

public class W10_PA5{
    
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);

        try {
            //System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);

          //  System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheitInput = scanner.nextDouble();
            double celsiusOutput = TemperatureConverter.fahrenheitToCelsius(fahrenheitInput);
            System.out.println("Temperature in Celsius: " + celsiusOutput);
        } catch (TemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input");
        } finally {
            scanner.close();
        }
    }
}