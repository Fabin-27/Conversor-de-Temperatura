package entities;

public class ToKelvin extends ToCelsius{
	
	public ToKelvin() {
	}

	public ToKelvin(Double celsius, Double fahrenheit, Double kelvin) {
		super(celsius, fahrenheit, kelvin);
	}
	
	public void CelsiusToKelvin() {
		Kelvin = Celsius + 273.15;
	}
	
	public void FahrenheitToKelvin() {
		Kelvin = (Fahrenheit - 32) * (9/5) + 273.15;
	}

}
