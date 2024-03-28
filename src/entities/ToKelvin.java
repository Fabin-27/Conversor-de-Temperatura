package entities;

public class ToKelvin {

	private Double Kelvin;
	private Double Fahrenheit;
	private Double Celsius;

	public ToKelvin() {

	}

	public ToKelvin(Double fahrenheit, Double celsius) {

		Fahrenheit = fahrenheit;
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

	public Double CelsiusToKelvin() { // testado
		return Kelvin = Celsius + 273.15;
	}

	public Double FahrenheitToKelvin() { // testado
		return Kelvin = ((Fahrenheit - 32) * 5/9) + 273.15 ;  
	}

}
