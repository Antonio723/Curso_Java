import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		System.out.println("Write your wage:");
		Scanner in = new Scanner(System.in);
		double wage = in.nextDouble();
		in.close();
		
		double totalToPay = 0.0;
		if (wage < 2000) {
			System.out.println("Thanks, but you should pay tax, you'rea exempt");
		}else if(wage>2000 && wage<=3000) {
			totalToPay = 1000 * 0.08;
		}else if (wage>3000 && wage <= 4500) {
			totalToPay = (1000*0.08) + (wage-3000) * 0.18;
		}else if (wage > 4500) {
			totalToPay = (1000*0.08) + (1500 * 0.18) + (wage-4500) * 0.28;
		}
		
		System.out.println("You need pay "+totalToPay+" for tax");
	}
	
}
