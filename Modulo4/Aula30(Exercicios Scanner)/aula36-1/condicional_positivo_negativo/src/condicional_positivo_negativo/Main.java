package condicional_positivo_negativo;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double nunmber = in.nextDouble();
		
		if(nunmber>=0) {
			System.out.println("POSITIVO");
		}else {
			System.out.println("NEGATIVO");
		}
		
	}

}
