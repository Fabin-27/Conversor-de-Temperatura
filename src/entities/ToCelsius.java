package entities;

public class ToCelsius extends Temperature {

	public ToCelsius(double rate) {
		super(rate);
	}

	public Double KelvinToCelsius(double celsius) { 
		return celsius = getRate() - 273.15;
	}

	public Double FahrenheitToCelsius(double celsius) { 
		return celsius = ((getRate() - 32) * 5 / 9);
	}

}
