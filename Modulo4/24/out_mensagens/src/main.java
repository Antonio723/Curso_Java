import java.util.Locale;

public class main {
	public static void main(String[] args) {
		
		/*Seta as informa��es de formatadores do programa*/
		Locale.setDefault(Locale.US);
		
		int y = 32;
		double x = 10.684050;
		System.out.println(y);
		System.out.printf("o n�mero de x � %.4f %n", x);
		
		System.out.println("Pulando uma linha ao final");
		System.out.print("Sem pular linha no fim");
		System.out.printf("\n Comando para simplificar doubles");
		
		/*FORMATADORES DO PRINTF
		 * 
		 *	%f ponto flutuante
		 *	%d inteiro
		 * 	%s texto
		 * 	%n quebra de linha
		 * 	\t tavula��o
		 * 	\n quebra de linha
		 * 
		 * */
	}
}
