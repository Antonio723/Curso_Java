package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		Student s1 = new Student();
		
		System.out.println("Digite o nome do aluno e suas notas em cada trimestre: ");
		s1.name = in.next();
		s1.grade1 = in.nextDouble();
		s1.grade2 = in.nextDouble();
		s1.grade3 = in.nextDouble();
		
		System.out.printf("Final grade = %.2f%n", s1.getFinalGrade());
		if(s1.getFinalGrade() >= 60) {
			System.out.println("Pass");
		}else {
			System.out.println("Failed");
			System.out.printf("MISSING %.2f POINTS%n", s1.getMissingPoints());
		}
		
		in.close();
	}

}
