public class Main {
	public static void main(String args[]) {
		//para user o casting(conversão de tipo) basta usar a sintaxe
		//tipo nomeVariavel = (tipo desejado) operação desejada
		int x, y;
		double result;
		
		x=5;
		y=2;
		
		result = x/y;
		System.out.println("Sem o casting: "+result);
		/*Obs: a divisão de números inteiros por padrão o compilador interpreta que deve
		 * dar um resultado inteiro.Para evitar isso, usamos o casting*/
		
		result = (double) x/y;
		System.out.println("Com o casting "+result);
	}
}
