package entities;

public abstract class Temperature {

	protected double Rate;

	public Temperature() {
 
	}

	public Temperature(double rate) {
		Rate = rate;
	}

	public double getRate() {
		return Rate; 
	}

	public void setRate(double rate) {
		Rate = rate;
	}

}
