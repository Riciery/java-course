import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codPeca1 = sc.nextInt();
		int qtdPeca1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();

		int codPeca2 = sc.nextInt();
		int qtdPeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();

		double valorPagar = qtdPeca1 * valorPeca1 + qtdPeca2 * valorPeca2;

		System.out.printf("Valor a pagar R$ %.2f%n", valorPagar);

		sc.close();

	}

}
