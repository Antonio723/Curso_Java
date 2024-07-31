package duracao_campeonato;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite hora inicial: ");
		int h1 = in.nextInt();
		System.out.println("Digite hora final: ");
		int h2 = in.nextInt();

		int duracao;
		if (h1 < h2) {
			duracao = h2 - h1;
		}
		else {
			duracao = 24 - h1 + h2;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		in.close();
	}

}
