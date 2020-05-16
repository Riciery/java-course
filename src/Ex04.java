import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroF = sc.nextInt();
		int horasTrab = sc.nextInt();
		double valorHora = sc.nextDouble();

		double salarioFinal = horasTrab * valorHora;

		System.out.println("O número do funcionário é: " + numeroF);
		System.out.printf("O salário é de: %.2f%n", salarioFinal);

	}

}
