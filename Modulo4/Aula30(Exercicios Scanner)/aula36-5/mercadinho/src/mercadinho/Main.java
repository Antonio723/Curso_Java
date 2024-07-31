package mercadinho;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o número do item: ");
		int item = in.nextInt();
		System.out.println("Digite a quantidade: ");
		int qtd = in.nextInt();
		
		if(item == 1) {
			System.out.printf("Total: R$ %.2f", (double)(4*qtd));
		}else if(item == 2){
			System.out.printf("Total: R$ %.2f", (double)(4.5*qtd));
		}else if(item == 3) {
			System.out.printf("Total: R$ %.2f", (double)(5*qtd));
		}else if(item == 4) {
			System.out.printf("Total: R$ %.2f", (double)(2*qtd));
		}else if(item == 5) {
			System.out.printf("Total: R$ %.2f", (double)(1.5*qtd));
		}
		
		in.close();


	}

}
