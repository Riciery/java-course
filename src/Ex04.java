import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroF = sc.nextInt();
		int horasTrab = sc.nextInt();
		double valorHora = sc.nextDouble();

		double salarioFinal = horasTrab * valorHora;

		System.out.println("O n�mero do funcion�rio �: " + numeroF);
		System.out.printf("O sal�rio � de: %.2f%n", salarioFinal);

	}

}
