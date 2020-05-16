import java.util.Scanner;

public class TesteDebug {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int cont = 0;
		
		while (numero != 0) {
			cont += numero;
			numero = sc.nextInt();
		}
		
		    System.out.println("A soma : "+ cont);
			System.out.println("Fim da entrada de números");
			
			sc.close();
	}
			
}