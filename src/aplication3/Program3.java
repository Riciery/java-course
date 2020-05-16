package aplication3;

import java.util.Locale;
import java.util.Scanner;

import entities3.Student;

public class Program3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();
		System.out.print("Plase, type the student's name: ");
		student.name = sc.nextLine();

		System.out.println();
		System.out.print("Plase, type scores the below student: ");
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();

		System.out.println();
		System.out.printf("Final grade : %.2f%n", student.notaFinal());

		if (student.notaFinal() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("Faltando %.2f Pontos%n", student.resultado());
		} 
		else {
			System.out.println("PASS");
		}

		sc.close();
	}

}
