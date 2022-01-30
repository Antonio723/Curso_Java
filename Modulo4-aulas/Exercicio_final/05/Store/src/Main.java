import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		int thing1 = in.nextInt();
		int thingsNumbr1 = in.nextInt();
		double UnitaryValue1 = in.nextDouble();
		double total1 = thingsNumbr1 * UnitaryValue1;
		
		int thing2 = in.nextInt();
		int thingsNumbr2 = in.nextInt();
		double UnitaryValue2 = in.nextDouble();
		double total2= thingsNumbr2 * UnitaryValue2;
		
		double total = total1 + total2;
		
		System.out.printf("Valor a pagar: R$ %.2f", total);
		
	}

}
