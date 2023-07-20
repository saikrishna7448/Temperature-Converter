import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Temperature Conversion Utility");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.println("3. Convert Celsius to Kelvin");
            System.out.println("4. Convert Kelvin to Celsius");
            System.out.println("5. Convert Fahrenheit to Kelvin");
            System.out.println("6. Convert Kelvin to Fahrenheit");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the program.");
                break;
            }

            System.out.print("Enter temperature value: ");
            double temperature = scanner.nextDouble();

            try {
                switch (choice) {
                    case 1:
                        System.out.println(celsiusToFahrenheit(temperature) + " °F");
                        break;
                    case 2:
                        System.out.println(fahrenheitToCelsius(temperature) + " °C");
                        break;
                    case 3:
                        System.out.println(celsiusToKelvin(temperature) + " K");
                        break;
                    case 4:
                        System.out.println(kelvinToCelsius(temperature) + " °C");
                        break;
                    case 5:
                        System.out.println(fahrenheitToKelvin(temperature) + " K");
                        break;
                    case 6:
                        System.out.println(kelvinToFahrenheit(temperature) + " °F");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    // Conversion methods
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return kelvin * 9 / 5 - 459.67;
    }
}
