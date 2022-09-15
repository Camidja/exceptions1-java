package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter the data");
			System.out.println("Account number");
			int number = sc.nextInt();
			System.out.println("Holder");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.println("Balance");
			double balance = sc.nextDouble();
			System.out.println("Withdraw Limit");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println();
			System.out.println("Enter the withdraw value");
			double withdrawValue = sc.nextDouble();
			
			account.withdraw(withdrawValue);
			System.out.printf("New Balance: %.2f%n", account.getBalance());
		}
		
		catch(InputMismatchException e){
			System.out.println("Invalid format");
		}
		
		catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		sc.close();

	}

}
