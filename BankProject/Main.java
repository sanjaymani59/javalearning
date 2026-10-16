package BankProject;
import java.util.Scanner;

public class Main {
	static Scanner scanner =new Scanner (System.in);

	public static void main(String[] args) {
		
	
		double  balance=0;
		boolean isRunning =true;
		int choice;
		
		while(isRunning) {
			System.out.println("****************************************************");
			System.out.println("BANKING PROGRAM");
			System.out.println("1. SHOW BALANCE");
			System.out.println("2.DEPOSIT");
			System.out.println("3. WITHDRAW");
			System.out.println("4.EXIT");
			System.out.println("*******************************************************");
		
		
			System.out.println("ENTER YOUR CHOICE (1-4):");
			
			choice=scanner.nextInt();
		
			switch(choice) {
				case 1 -> showBalance(balance);
				case 2 -> balance +=deposit();
				case 3 -> balance-= withdraw(balance);
				case 4 -> isRunning =false;
				default -> System.out.println("INVALID VALUE");
				
			}
		}
		
		
		System.out.println("****************************************************");
		System.out.println("Thank you !! have a nice day . ");
		
		scanner.close();
	}
	
	static void showBalance(double balance) {
		System.out.println("****************************************************");
		System.out.printf("$%.2f\n",balance);
		}
		static double deposit() {
			double amount;
			System.out.println("Enter an Amount to be deposited : ");
			amount = scanner.nextDouble();
			
			
			if(amount<0) {
				System.out.println("Amount can't be negative ");
				return 0;
			}
			else {
				return 0;
			}
		}
		
		static double withdraw(double balance) {
			
			double amount;
			System.out.print("Enert amount to be withdraw: ");
			amount=scanner.nextDouble();
			
			if(amount > balance) {
				System.out.println("INSUFFICIENT FUNDS");
				return 0;
				
			}
			else if(amount <0) {
				System.out.println("Amount can't be nagative ");
				return 0;
			}
			else {
				return amount;
			}
		}
	
}

	

	
	
	
	
	
	
	
	
//	https://youtu.be/49bIIa6id08?si=hq63WZMhPrCQiIHu

