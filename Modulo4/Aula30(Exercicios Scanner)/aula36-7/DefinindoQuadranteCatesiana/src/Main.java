import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor de X :");
		double x = in.nextDouble();
		System.out.println("Digite o valor de Y :");
		double y = in.nextDouble();
		
		if(x > 0 && y >0) {
			System.out.println("Q1");
		}else if(x < 0 && y >0) {
			System.out.println("Q2");
		}else if(x < 0 && y <0) {
			System.out.println("Q3");
		}else if(x > 0 && y < 0) {
			System.out.println("Q4");
		}else if(x == 0 && y== 0) {
			System.out.println("Origem");
		}else {
			System.out.println("ERROR");
		}
		
		in.close();
	}

}
