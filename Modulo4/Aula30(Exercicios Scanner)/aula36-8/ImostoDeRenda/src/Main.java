import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o sálario: ");
		double salary = in.nextDouble();
		double tax = 0;
		
		if(salary > 0 && salary <= 200) {
			tax = 0;
		}else if(salary >2000 && salary <=3000) {
			tax = (salary-2000)*0.08;
		}else if(salary >300 && salary <=4500) {
			tax = (salary-2000)*0.18;
		}else if(salary > 4500){
			tax = (salary-2000)*0.28;
		}
		
		System.out.printf("Imposto: R$ %.2f%n ",tax);
		
		in.close();

	}

}
