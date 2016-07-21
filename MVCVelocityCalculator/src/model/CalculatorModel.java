package model;


public class CalculatorModel {
	private double calculatedValue;

	public double divide(double distance, double time) {
		calculatedValue = distance / time;
		return Math.round(calculatedValue * 100.0) / 100.0;
	}

	public double multiply(double velocity, double time) {
		calculatedValue = velocity * time;
		return Math.round(calculatedValue * 100.0) / 100.0;
	}

}
