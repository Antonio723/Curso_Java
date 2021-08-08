import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner (System.in);
        
        int cod0, quantity0, cod1, quantity1;
        double value0, value1;
        cod0 = in.nextInt();
        quantity0 = in.nextInt();
        value0 = in.nextDouble();
        
        cod1 = in.nextInt();
        quantity1 = in.nextInt();
        value1 =  in.nextDouble();
        in.close();
        
        double total = (quantity0 * value0) + (quantity1 * value1);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
    }
 
}