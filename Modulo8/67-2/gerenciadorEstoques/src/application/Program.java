package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		Product p1 = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name:");
		p1.name = in.next();
		System.out.print("Price: ");
		p1.price = in.nextDouble();
		System.out.print("Quantity in stock: ");
		p1.addProducts(in.nextInt());
		System.out.println("Product data: "+p1.toString());;
		
		System.out.print("Enter the number of products to be added in stock: ");
		p1.addProducts(in.nextInt());
		
		System.out.print("Updated data: "+p1.toString());
		
		System.out.printf("%nEnter the number of produdcts to be removed from stok: ");
		p1.removeProducts(in.nextInt());
		
		System.out.print("Updated data: "+p1.toString());
		
		in.close();
		System.out.println("program finished ");

	}

}
