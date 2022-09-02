package miniBankingApp.java;

import java.util.Scanner;

class bankingFunction{
	
	private double balance=2500.36;
	
	void check_balance() {
		System.out.println("your balance is "+this.balance);
	}
	
	void add_money() {
		Scanner input = new Scanner(System.in);
		
		double new_balance;
		System.out.println("enter the amount you want to add");
		new_balance = input.nextDouble();
		
		balance+=new_balance;
		
		System.out.println("your account is now "+ balance);
	}
	
	void withdraw_money() {
		Scanner input = new Scanner(System.in);
		
		double withdraw_money;
		System.out.println("enter the amount you want to withdraw");
		withdraw_money = input.nextDouble();
		
		this.balance-=withdraw_money;
		
		System.out.println("your balance is now "+this.balance);
		
	}
	
	void userDecision() {
		Scanner input = new Scanner(System.in);
		System.out.println("choose what you want to do\ncheck balance, add money, withdraw money");
		String answer = input.nextLine();
		
		if(answer.equals("check balance")) {
			check_balance();
		}
		
		else if(answer.equals("add money")) {
			add_money();
		}
		
		else if(answer.equals("withdraw money")) {
			withdraw_money();
		}
		
		else {
			System.out.println("please choose between the three options");
		}
	}
}