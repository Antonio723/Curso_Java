import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int quantity = in.nextInt();
		int number, em=0, out=0;
		
		for(int i = 0; i<quantity;i++) {
			number = in.nextInt();
			if(number >=10 && number <=20) {
				em++; 
			}else {
				out++;
			}
		}
		System.out.println("in: "+em);
		System.out.println("out: "+out);
		in.close();
		
	}

}
