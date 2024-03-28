package entities;

public class ToFahrenheit  {
	
	private Double Kelvin;
	private Double Fahrenheit;
	private Double Celsius;

	public ToFahrenheit() {

	}

	public ToFahrenheit(Double kelvin, Double celsius) {

		Kelvin = kelvin;
		Celsius = celsius;
	}

	public Double getKelvin() {
		return Kelvin;
	}

	public void setKelvin(Double kelvin) {
		Kelvin = kelvin;
	}

	public Double getFahrenheit() {
		return Fahrenheit;
	}

	public void setFahrenheit(Double fahrenheit) {
		Fahrenheit = fahrenheit;
	}

	public Double getCelsius() {
		return Celsius;
	}

	public void setCelsius(Double celsius) {
		Celsius = celsius;
	}

	

	public Double CelsiusToFahrenheit() { // testado
		return Fahrenheit = ((Celsius * 9 / 5) + 32);
	}

	public Double KelvinToFahrenheit() { // testado
		return Fahrenheit = (Kelvin * 9 / 5) - 459.67;
	}

}
