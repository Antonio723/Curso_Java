package localizarPosicaoArrays;
import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Digite um número: ");
		double number = in.nextDouble();
		
		if(number <=25 && number >0) {
			System.out.println("Intervalo 0, 25");
		}else if(number > 25 && number <=50) {
			System.out.println("Intervalo 25, 50");
		}else if(number >= 75 && number <= 100) {
			System.out.println("Intervalo 75,100");
		}else {
			System.out.println("Fora de intervalo");
		}
		
		in.close();

	}

}
