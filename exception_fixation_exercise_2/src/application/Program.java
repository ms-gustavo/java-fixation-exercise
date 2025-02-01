package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer accountNumber = sc.nextInt();
			System.out.print("Holder: ");
			sc.next();
			String accountHolder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double accountInitialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double accountWithdrawLimit = sc.nextDouble();
			
			Account account = new Account(accountNumber, accountHolder, accountInitialBalance, accountWithdrawLimit);
			System.out.print("Enter amount for withdraw: ");
			Double amountForWithdraw = sc.nextDouble();
			
			account.withdraw(amountForWithdraw);
			System.out.print("New balance: " + account.getBalance());
		} catch(DomainException e) {
			System.out.print("Withdraw error: " + e.getMessage());
		} catch(RuntimeException e) {
			System.out.print("Unexpected error");
		}
		
		
		
		sc.close();

	}

}
