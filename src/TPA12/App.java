package TPA12;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TempConverter tempConverter = new TempConverter();
        // 1.
        System.out.println("100 Celsius = " + tempConverter.convertToFahr(100) + " Fahrenheit");
        System.out.println("100 Fahrenheit = " + tempConverter.convertToCelsius(100) + " Celsius");

        // 2.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperatura in Celsius: ");
        double TempCelsius = scanner.nextDouble();
        System.out.println(TempCelsius + " Celsius = "+ tempConverter.convertToFahr(TempCelsius) + " Fahrenheit");

        System.out.println("Temperatura in Fahrenheit: ");
        double TempFahr = scanner.nextDouble();
        System.out.println(TempFahr + " Fahrenheit = "+ tempConverter.convertToCelsius(TempFahr) +" Celsius");
    }
}