package entities;

public class ToCelsius {
	
	protected Double Celsius;
	protected Double Fahrenheit;
	protected Double Kelvin;
	
	public ToCelsius() {
	}

	public ToCelsius(Double celsius, Double fahrenheit, Double kelvin) {
		this.Celsius = celsius;
		Fahrenheit = fahrenheit;
		Kelvin = kelvin;
	}

	public Double getCelsius() {
		return Celsius;
	}

	public void setCelsius(Double celsius) {
		this.Celsius = celsius;
	}

	public Double getFahrenheit() {
		return Fahrenheit;
	}

	public void setFahrenheit(Double fahrenheit) {
		Fahrenheit = fahrenheit;
	}

	public Double getKelvin() {
		return Kelvin;
	}

	public void setKelvin(Double kelvin) {
		Kelvin = kelvin;
	}
	
	public void KelvinToCelsius() {
		Celsius = Kelvin - 273.15;
	}
	
	public void FahrenheitToCelsius() {
		Celsius = ((Fahrenheit - 32) * (5/9));
	}
	
	
	
	

}
