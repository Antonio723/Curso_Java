import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        
        int functionary = in.nextInt();
        int hours = in.nextInt();
        double valueHour = in.nextDouble();
        
        double total = hours * valueHour;
        in.close();
        
        System.out.printf("NUMBER = %d%n",functionary);
        System.out.printf("SALARY = U$ %.2f%n", total);
        
    }
 
}