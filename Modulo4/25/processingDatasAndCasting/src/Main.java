public class Main {
	public static void main(String args[]) {
		//para user o casting(convers�o de tipo) basta usar a sintaxe
		//tipo nomeVariavel = (tipo desejado) opera��o desejada
		int x, y;
		double result;
		
		x=5;
		y=2;
		
		result = x/y;
		System.out.println("Sem o casting: "+result);
		/*Obs: a divis�o de n�meros inteiros por padr�o o compilador interpreta que deve
		 * dar um resultado inteiro.Para evitar isso, usamos o casting*/
		
		result = (double) x/y;
		System.out.println("Com o casting "+result);
	}
}
