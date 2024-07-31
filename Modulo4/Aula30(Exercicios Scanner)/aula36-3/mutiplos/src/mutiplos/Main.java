package mutiplos;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Primeir número: ");
		double n1 = in.nextDouble();
		System.out.println("Segundo número: ");
		double n2 = in.nextDouble();
		
		in.close();
		
		if(n1%n2 == 0 || n2%n1==0) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao sao mutiplos");
		}
	}

}
