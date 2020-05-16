package aplication4;

import java.util.Locale;
import java.util.Scanner;

import entities4.Account;

public class Progam {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("\nIs there an initial deposit (y/n): ");
		char response = sc.next().charAt(0);
		
		//while (response == 'y' || response == 'n')
			if (response == 'y') {
				System.out.print("Type to add the deposit value: $ ");
				double initialDeposit = sc.nextDouble();
				account = new Account(number, holder, initialDeposit);
			}/*
			else if (response == 'n') {
				System.out.println("Right, the balance will be $0.00");
				account = new Account(number, holder);
			}*/
			else {
				//System.out.println("Invalid option, ,try again!");
				account = new Account(number, holder);
			}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);

		sc.close();
	}

}
