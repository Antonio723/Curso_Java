import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.println("Write a number:");
		Scanner in = new Scanner(System.in);
		double num  = in.nextDouble();
		in.close();
		
		if (num>0 && num<=25) {
			System.out.printf("O número %f está entre 0 e 25", num);
		}else if(num>25 && num<=50) {
			System.out.printf("O número %f está entre 25 e 50", num);
		}else if(num>50 && num<=75) {
			System.out.printf("O número %f está entre 50 e 75", num);
		}else if(num>75 && num<=100) {
			System.out.printf("O número %f está entre 75 e 100", num);
		}else {
			System.out.println("Este número está fora dos intervalos");
		}
		
	}
}
