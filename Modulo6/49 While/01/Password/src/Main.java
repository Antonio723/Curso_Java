import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int password = in.nextInt();
		
		while(password != 2002) {
			System.out.printf("Senha Invalida %n\n");
			password = in.nextInt();
		}
	
		System.out.println("Acesso Permitido");
		in.close();
	}
}
