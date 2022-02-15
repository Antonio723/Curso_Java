package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = in.nextLine();
		System.out.print("Price: ");
		product.price = in.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = in.nextInt();
		
		System.out.printf("%nProduct data: %s%n", product);		
		
		System.out.println("Enter the number of product to be added in stock");	
		int quantity = in.nextInt();
		product.addProducts(quantity);
		System.out.printf("%nUpdated data %s%n", product);
		
		System.out.println("Enter the number of products to be removed from stock:");
		quantity = in.nextInt();
		product.removeProducts(in.nextInt());
		System.out.printf("Updated data %s, $ %.f2, %d units, Total: $ %.2f%n", product.name, product.price, product.quantity, product.totalValueInStock());
		
		in.close();  
	}
}
