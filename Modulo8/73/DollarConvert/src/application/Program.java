package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Exchange;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ENGLISH);
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is the dollar price?");
		double price = in.nextDouble();
		System.out.printf("%nHow many dollar will be tought?");
		double value = in.nextDouble();
		double total = Exchange.convert(price, value);
		System.out.printf("%nAmount to be paid in reais = %.2f", total);
		
		in.close();
	}
}
