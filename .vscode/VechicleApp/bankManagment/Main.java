package .vscode.VechicleApp.bankManagment;

// package Bankproject;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner =new Scanner (System.in);
	
		double  balance=0;
		boolean idRunning =true;
		int choice;
	
	
		System.out.println("****************************************************");
		System.out.println("BANKING PROGRAM");
		System.out.println("******************************************************");
		System.out.println("1. SHOW BALANCE");
		System.out.println("2.DEPOSIT");
		System.out.println("3. WITHDRAW");
		System.out.println("4.EXIT");
		System.out.println("*******************************************************");
	
	
		System.out.println("ENTER YOUR CHOICE (1-4):");
		
		choice=scanner.nextInt();
	
		switch(choice) {
			case 1 -> System.out.println(balance);
			case 2 -> System.out.println("2.DEPOSIT");
			case 3 -> System.out.println("3. WITHDRAW");
			case 4 -> idRunning =false;
			default -> System.out.println("INVALID VALUE");
		}
	}
}
	
	
// 	}
// 	static void showBalance(double balance) {
// 		System.out.printf("$%f", balance);
// }
	
	
	
	
	
	
	
	
	
	
//	https://youtu.be/49bIIa6id08?si=hq63WZMhPrCQiIHu

