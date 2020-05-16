import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double raio = sc.nextDouble();
		double pi = 3.14159;

		double areaRaio = pi * (raio * raio);

		System.out.printf("A area do circulo é: %.4f%n", areaRaio);

	}

}