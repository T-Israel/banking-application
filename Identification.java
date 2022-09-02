package miniBankingApp.java;

import java.util.Scanner;
public class Identification{
	
	private String name;
	private String passWord;
	
	bankingFunction user;
	
	 Identification() {
		user= new bankingFunction(); 
		
	}
	
	 void userRegistration() {
		Scanner input= new Scanner(System.in);

		System.out.println("hello register by entering your name");
		this.name=input.nextLine();
		
		System.out.println("please enter a password");
		this.passWord = input.nextLine();
		
 }
	 String name_accessor() {
		 return this.name;
	 }
	 
	 String pass_accessor() {
		 return this.passWord;
	 } 
	 void login() {
		 Scanner in = new Scanner(System.in);
		 System.out.println("login to your account");
		 System.out.println();
		 System.out.println("enter your user name");
		 String userName = in.nextLine();
		 
		 System.out.println("enter your password");
		 String pass = in.nextLine();
		 
		 if(userName.equals(name_accessor()) && pass.equals(pass_accessor())) {
			 System.out.println("Welcome");
			 
			 user.userDecision();
		 }
		 
		 else {
			 System.out.println("either your password or username is incorrect");
		 }
		 
	 } 
}