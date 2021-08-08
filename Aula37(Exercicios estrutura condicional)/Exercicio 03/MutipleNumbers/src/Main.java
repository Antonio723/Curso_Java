import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.println("Write two numbers:");
		Scanner in = new Scanner(System.in);
		double num1 = in.nextDouble();
		double num2 = in.nextDouble();
		in.close();
		
		if( (num1 % num2) == 0 && (num2 % num1) == 0) {
			System.out.println("These numbers is MULTIPLES");
		}else {
			System.out.println("These numbers not are MULTIPLES");
		}
	}
}
