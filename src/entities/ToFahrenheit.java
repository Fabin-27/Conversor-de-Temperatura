package entities;

public class ToFahrenheit extends ToCelsius {

	public ToFahrenheit() {
	}

	public ToFahrenheit(Double celsius, Double fahrenheit, Double kelvin) {
		super(celsius, fahrenheit, kelvin);
	}
	
	
	public void CelsiusToFahrenheit() {
		Fahrenheit = ((Celsius * (9/5)) + 32);
	}
	
	public void KelvinToFahrenheit() {
		Fahrenheit = (Kelvin -273.15) * (9/5) + 32;
	}

}
