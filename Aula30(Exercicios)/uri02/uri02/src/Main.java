import java.io.IOException;

import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        
        Scanner in = new Scanner(System.in);
        double pi = 3.14159;
        double r = in.nextDouble();
        double a = pi * (r * r);
        
        System.out.printf("A=%.4f", a);
 
    }
 
}