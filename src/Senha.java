import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		int cont = 0;
		
		while (senha != 2002) {
			System.out.println("Acesso inv�lido!");
			cont += 1;
			System.out.println("Voc� j� efetuou: " + cont + " tentativas. Ap�s a 3a vao bloquear!!!");
			senha = sc.nextInt();
		}
			System.out.println("Acesso permitido!");
			
			sc.close();
	}

}
