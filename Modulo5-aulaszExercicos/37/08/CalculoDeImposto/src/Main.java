import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		double salary = in.nextDouble();
		in.close();
		double total;
		
		if(salary < 2000) {
			total = 0;
		}else if(salary < 3000) {
			total = (salary - 2000) * 0.08;
		}else if(salary < 4500) {
			total =(salary - 3000) * 0.18+ (1000*0.08);
		}else {
			total = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if(total == 0) {
			System.out.println("Insento");
		}else {
			System.out.printf("R$ %.2f\n", total);
		}
	}
}
