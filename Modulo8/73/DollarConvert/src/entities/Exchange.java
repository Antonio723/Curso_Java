package entities;

public class Exchange {

	public static double convert(double price, double value) {
		return price * value * 1.06;
	}
}
