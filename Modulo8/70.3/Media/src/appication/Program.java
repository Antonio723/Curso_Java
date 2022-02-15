package appication;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Aluno a = new Aluno();
		
		a.name = in.nextLine();
		a.note1 = in.nextDouble();
		a.note2 = in.nextDouble();
		a.note3 = in.nextDouble();
		
		in.close();
		
		System.out.printf("FINAL GRADE = %.2f%n", a.CalcMedia());
		System.out.println(a.media());
	}
}
