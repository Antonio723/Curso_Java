import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int combustivel = in.nextInt();
		int gasolina = 0, etanol = 0, disel = 0;
		
		while(combustivel != 4){
			if(combustivel == 1) {
				etanol += 1;
				System.out.println("Etanol: "+etanol);
			}else if(combustivel == 2){
				gasolina += 1;
				System.out.println("Gasolina: "+gasolina);
			}else if(combustivel == 3){
				disel += 1;
				System.out.println("Disel: "+disel);
			}else {
				System.out.println("Digite um combustivel v�lido");
			}
			combustivel = in.nextInt();
		}
		in.close();
		System.out.println("Fim da execu��o");
	}
}
