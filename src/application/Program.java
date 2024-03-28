package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ToCelsius;
import entities.ToFahrenheit;
import entities.ToKelvin;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int x;
		int y;
		double temperature;

		System.out.println("Welcome");
		System.out.println();
		System.out.println("Enter the temperature value:");

		temperature = sc.nextDouble();

		System.out.println("What scale is the temperature on?");
		System.out.println("(1) Celsius");
		System.out.println("(2) Fahrenheit");
		System.out.println("(3) Kelvin");

		x = sc.nextInt();

		switch (x) {

		case 1:

			System.out.println("What scale do you want to convert to?");
			System.out.println("(1) Fahrenheit");
			System.out.println("(2) Kelvin");

			y = sc.nextInt();

			switch (y) {

			case 1:
				ToFahrenheit tf = new ToFahrenheit(temperature, temperature);
				System.out.println(temperature + "°C" + " = " + String.format("%.0f", tf.CelsiusToFahrenheit()) + "°F");

				break; 

			case 2:

				ToKelvin tk = new ToKelvin(temperature, temperature);
				System.out.println(temperature + "°C" + " = " + String.format("%.0f", tk.CelsiusToKelvin()) + "°K");

				break;
			}
			break;

		case 2:

			System.out.println("What scale do you want to convert to?");
			System.out.println("(1) Celsius");
			System.out.println("(2) Kelvin");

			y = sc.nextInt();

			switch (y) {

			case 1:

				ToCelsius tc = new ToCelsius(temperature, temperature);
				System.out.println(temperature + "°F" + " = " + String.format("%.0f", tc.FahrenheitToCelsius()) + "°C");

				break;

			case 2:
				
				ToKelvin tk = new ToKelvin(temperature, temperature);
				System.out.println(temperature + "°F" + " = " + String.format("%.0f", tk.FahrenheitToKelvin()) + "°K");

				break;
			}
			
			break;
			
		case 3:

			System.out.println("What scale do you want to convert to?");
			System.out.println("(1) Celsius");
			System.out.println("(2) Fahrenheit");

			y = sc.nextInt();

			switch (y) {

			case 1:

				ToCelsius tc = new ToCelsius(temperature, temperature);
				System.out.println(temperature + "°K" + " = " + String.format("%.0f", tc.KelvinToCelsius()) + "°C");

				break;

			case 2:
				
				ToFahrenheit tf = new ToFahrenheit(temperature, temperature);
				System.out.println(temperature + "°K" + " = " + String.format("%.0f", tf.KelvinToFahrenheit()) + "°F");

				break;
			}
			
			break;

		}

		sc.close();

	}

}
