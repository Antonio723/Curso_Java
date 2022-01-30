
public class Main {
	//Objetivo da aula: Processamento de dados/ Casting
	public static void main(String []args) {
		
		//Calculo da area de um trapezio a=(b + B) /2 * h
		
		double b, B, h;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		double area = (b + B) /2 * h;
		
		System.out.println(area);
		
		
		int c, d;
		double result;
		c=10;
		d=4;
		result = c/d;
		System.out.println(result); /*Neste exemplo vemos que o resultado é um numero não fracionario,
		pois a divisao foi entre dois int, se você quiser a parte fracionaria basta fazer um casting,
		nesse  caso adcionando o tipo double antes da divisao acontecer, veja abaixo um exemplo de como 
		guardar a parte fracionaria, OBS:A variavel que ira guardar o valor deve consguir guardar numero de ponto
		flutuante, se ela for int possivelmente irá haver erro*/
		
		
		result = (double) c/d; //casting para não perder dados
		System.out.println(result);
		
		result = (int) c/d; //casting para vir apenas a parte inteira da divisao
		System.out.println(result);
		
	}
	
}
