import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("Wirte a number:");
		Scanner in = new Scanner(System.in);
		double num = in.nextDouble();
		double result = num%2;
		in.close();
		
		if (result == 0) {
			System.out.printf("The number %.2f is EVEN", num);
		}else if(result != 0) {
			System.out.printf("The number %.2f is ODD", num);
		}
	}
	
}
