package entities;

public class ToFahrenheit extends Temperature {

	public ToFahrenheit(double rate) {
		super(rate);
	}

	public Double CelsiusToFahrenheit(double Fahrenheit) {
		return Fahrenheit = ((getRate() * 9 / 5) + 32);
	}

	public Double KelvinToFahrenheit(double Fahrenheit) {
		return Fahrenheit = (getRate() * 9 / 5) - 459.67;
	}

}
