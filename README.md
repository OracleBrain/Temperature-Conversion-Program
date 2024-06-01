# Prodigy_SD_01
PRODIGY_SD_01

```markdown
# Temperature Conversion Program

This project is a simple temperature conversion program that allows users to convert temperatures between Celsius, Fahrenheit, and Kelvin scales. Users can input a temperature value along with its original unit of measurement, and the program will convert it to the other two units and display the results.

## Features

- Converts temperatures from Celsius to Fahrenheit and Kelvin.
- Converts temperatures from Fahrenheit to Celsius and Kelvin.
- Converts temperatures from Kelvin to Celsius and Fahrenheit.
- Provides a user-friendly interface for inputting temperature values and units.

## How to Use

1. Clone this repository to your local machine:

    ```sh
    git clone https://github.com/oraclebrain/PRODIGY_SD_01.git
    ```

2. Navigate to the project directory:

    ```sh
    cd PRODIGY_SD_01
    ```

3. Compile the Java program:

    ```sh
    javac PRODIGY_SD_01.java
    ```

4. Run the program:

    ```sh
    java TemperatureConverter
    ```

5. Follow the on-screen prompts to input a temperature value and its original unit of measurement. The program will display the converted temperatures.

## Example

If you enter a temperature of 25 degrees Celsius, the program will output the equivalent temperatures in Fahrenheit and Kelvin:

```
Enter the temperature value: 25
Enter the original unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin): C
Converted Temperatures:
Celsius: 25.0
Fahrenheit: 77.0
Kelvin: 298.15
```

## Code Overview

```java
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the original unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        String originalUnit = scanner.next().toUpperCase();

        double celsius = 0;
        double fahrenheit = 0;
        double kelvin = 0;

        switch (originalUnit) {
            case "C":
                celsius = temperature;
                fahrenheit = celsiusToFahrenheit(celsius);
                kelvin = celsiusToKelvin(celsius);
                break;
            case "F":
                fahrenheit = temperature;
                celsius = fahrenheitToCelsius(fahrenheit);
                kelvin = celsiusToKelvin(celsius);
                break;
            case "K":
                kelvin = temperature;
                celsius = kelvinToCelsius(kelvin);
                fahrenheit = celsiusToFahrenheit(celsius);
                break;
            default:
                System.out.println("Invalid unit of measurement.");
                return;
        }

        System.out.println("Converted Temperatures:");
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);

        scanner.close();
    }

    // Conversion functions
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}
```

- The `main` method prompts the user for a temperature value and its original unit of measurement.
- Depending on the unit provided, the program uses appropriate conversion functions to calculate the equivalent temperatures in the other two units.
- The converted temperatures are then displayed to the user.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any enhancements or bug fixes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
```

Feel free to customize this `README.md` file further to suit your specific project needs or preferences.
```