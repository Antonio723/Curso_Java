package class_twenty_four;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double x = 10.35784;
		// A intru�ao System.out.print exibe o resutado, e se over outro print em seguida, ele ir� aparecer na mesma linha do console.
		System.out.println("digite, e ao fim a instru��o pulao uma linha");
		System.out.printf("%.2f\n",x);
		System.out.printf("%.4f\n",x);
		Locale.setDefault(Locale.US);//Define o padrao de idioma, assim como o padrao numerico (, .)
		System.out.printf("%.4f\n",x);
		
		System.out.println("Para concatenar algo basta usar o operador '+' que ele ir� juntar suas sentencas");
		System.out.println("Variavel X : "+ x);
		
		System.out.println("J� para concatenar com o System.out.printf, basta no primeiro parametro usar string com a formata��o, e no segundo o valor a ser substituido");
		System.out.printf("O n�mero %.2f � o mesmo que %f por�m simplifcado %n", x ,x);
		
		System.out.println("O printf usa as seguintes representa��es de acordo com o tipo primitivo");
		System.out.println("%f para n�meros de ponto flutuante");
		System.out.println("%d para n�mero inteiros");
		System.out.println("%s para texto");
		System.out.println("%n para quebra de linha");
		
		String nome = "Maria";
		int idade = 18;
		double renda = 1856.450;
		System.out.printf("%s tem %d anos e tem uma renda mensal de %f %n%n", nome, idade, renda);
		System.out.printf("EXERCICIOS %n%n");
		
		String product1 = "computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		System.out.println("Products:");
		System.out.printf("%s, Which price is $ %.2f %n", product1, price1);
		System.out.printf("%s, Which price is $ %.2f %n%n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s %n%n", age, code, gender);
		
		System.out.printf("Measue with eith decimal places: %.8f %n", measure);
		Locale.setDefault(Locale.FRANCE);//Troca a "localizacao" da formatacao de decimal
		System.out.printf("Rouded ( three decimal places): %.3f %n", measure);
		Locale.setDefault(Locale.US);//Troca a "localizacao" da formatacao de decimal
		System.out.printf("US decimal point: %.3f", measure);
		
	}

}
