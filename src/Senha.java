import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		int cont = 0;
		
		while (senha != 2002) {
			System.out.println("Acesso inválido!");
			cont += 1;
			System.out.println("Você já efetuou: " + cont + " tentativas. Após a 3a vao bloquear!!!");
			senha = sc.nextInt();
		}
			System.out.println("Acesso permitido!");
			
			sc.close();
	}

}
