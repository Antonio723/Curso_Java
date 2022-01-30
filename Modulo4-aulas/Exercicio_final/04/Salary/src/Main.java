import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		int worker = in.nextInt();
		int workHours = in.nextInt();
		double hourValue = (double) in.nextDouble();
		
		double salary = workHours * hourValue;
		
		System.out.printf("Number = %d %n"
						+ "Salary = U$ %.2f", worker, salary);

	}

}
