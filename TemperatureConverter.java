import java.util.Scanner;
//Task-01
public class TemperatureConverter
{
public static void main(String[] args) 
{
    // Create a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);
       
        // Display introductory messages
        System.out.println("TASK 01");
        System.out.println("The program is represented by Aashis Jha");
        System.out.println("Temperature Converter");

        // Prompt the user to enter the temperature value
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        // Prompt the user to enter the original unit of measurement
        System.out.print("Enter the original unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        String originalUnit = scanner.next().toUpperCase();

        // Variables to store converted temperatures
        double celsius = 0;
        double fahrenheit = 0;
        double kelvin = 0;

        // Switch statement to handle conversion based on the original unit
        switch (originalUnit) 
       {
            case "C":
            // Convert from Celsius to Fahrenheit and Kelvin
                celsius = temperature;
                fahrenheit = celsiusToFahrenheit(celsius);
                kelvin = celsiusToKelvin(celsius);
                break;
            case "F":
            // Convert from Fahrenheit to Celsius and Kelvin
                fahrenheit = temperature;
                celsius = fahrenheitToCelsius(fahrenheit);
                kelvin = celsiusToKelvin(celsius);
                break;
            case "K":
            // Convert from Kelvin to Celsius and Fahrenheit
                kelvin = temperature;
                celsius = kelvinToCelsius(kelvin);
                fahrenheit = celsiusToFahrenheit(celsius);
                break;
            default:
            // Handle invalid unit of measurement
                System.out.println("Invalid unit of measurement.");
                return;
        }

         // Display the converted temperatures
        System.out.println("Converted Temperatures:");
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);

        // Close the Scanner object
        scanner.close();
    }

    // Conversion functions
    /**
     * Converts Celsius to Fahrenheit.
     * 
     * @param celsius The temperature in Celsius.
     * @return The temperature in Fahrenheit.
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Converts Celsius to Kelvin.
     * 
     * @param celsius The temperature in Celsius.
     * @return The temperature in Kelvin.
     */
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    /**
     * Converts Fahrenheit to Celsius.
     * 
     * @param fahrenheit The temperature in Fahrenheit.
     * @return The temperature in Celsius.
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * Converts Kelvin to Celsius.
     * 
     * @param kelvin The temperature in Kelvin.
     * @return The temperature in Celsius.
     */
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}
