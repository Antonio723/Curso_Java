import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int repetition = in.nextInt();
		
		for(int i = 0; i<=repetition; i++) {
			double n1 = in.nextDouble();
			double n2 = in.nextDouble();
			double n3 = in.nextDouble();
			
			double result = (n1*2+n2*3+n3*5)/10;
			
			System.out.printf(" %.1f",result);
			
		}
		in.close();

	}

}
