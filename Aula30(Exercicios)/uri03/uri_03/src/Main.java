import java.io.IOException;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        
        int sum = A+B;
        
        System.out.printf("SOMA = %d%n",sum);
    }
}