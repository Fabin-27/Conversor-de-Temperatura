package entities;

public class ToKelvin extends Temperature{

	public ToKelvin(double rate) {
		super(rate);
	}

	public Double CelsiusToKelvin(double Kelvin) {
		return Kelvin = getRate() + 273.15;
	}

	public Double FahrenheitToKelvin(double Kelvin) { 
		return Kelvin = ((getRate() - 32) * 5 / 9) + 273.15;
	}

}
