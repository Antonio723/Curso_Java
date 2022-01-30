import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int product = in.nextInt();
		int quantity = in.nextInt();
		
		if(product == 1) {
			System.out.println("Total: R$" + quantity * 4);
		}else if(product == 2){
			System.out.println("Total: R$" + quantity*4.5);
		}else if(product == 3) {
			System.out.println("Total: R$" + quantity * 5);
		}else if(product == 4) {
			System.out.println("Total: R$" + quantity * 2);
		}else if(product == 5) {
			System.out.println("Total: R$" + quantity * 1.5);
		}else {
			System.out.println("Produto não cadastrado");
		}
		
		in.close();

	}

}
