import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Write a number:");
		Scanner in = new Scanner(System.in);
		double num = in.nextDouble();
		in.close();
		
		if (num > 0) {
			System.out.printf("The number %.2f is positive", num);
		}else if(num == 0) {
			System.out.println("This number is the zero");
		}else if(num < 0) {
			System.out.printf("The numbe %.2f is negative",num);
		}
		
	}
}
