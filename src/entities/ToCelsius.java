package entities;

public class ToCelsius {

	private Double Kelvin;
	private Double Fahrenheit;
	private Double Celsius;

	public ToCelsius() {

	}

	public ToCelsius(Double kelvin, Double fahrenheit) {

		Kelvin = kelvin;
		Fahrenheit = fahrenheit;
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

	public Double KelvinToCelsius() {
		return Celsius = Kelvin - 273.15;
	}

	public Double FahrenheitToCelsius() { // testado
		return Celsius = ((Fahrenheit - 32) * 5 / 9);
	}

}
