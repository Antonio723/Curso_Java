import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		System.out.println("Write initial hour and finh hour");
		Scanner in = new Scanner(System.in);
		int first = in.nextInt();
		int second = in.nextInt();
		
		in.close();
		
		int result;
		if (first < second ) {
			result = first - second;
		}else {
			result = 24 - first + second;
			System.out.println(result > 0);
			
		}
		

		if(result < 0) {
			result  = (result) * (-1);
		}
		
		System.out.printf("total hours: %d", result);
		
	}
}
