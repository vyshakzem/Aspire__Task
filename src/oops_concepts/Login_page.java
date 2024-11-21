package oops_concepts;

import java.util.Scanner;

public class Login_page extends SignIn {
	public static void main(String args[]) {
		System.out.println("enter your choice \n");
		System.out.println("1.Registration 2.Login \n");
		Scanner selectpageScanner=new Scanner(System.in);
		int enterpage=selectpageScanner.nextInt();
		if(enterpage==1) {
			Registration.signin();}
		
		
	if(enterpage==2) {
		Login_page.SignIn("main menu");
		System.out.println("1.Employeeid 2.salary 3.logout \n");
	}
	}
	private static void SignIn(String string) {
		// TODO Auto-generated method stub
		
	}
	static public void signin() {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the user id:");
		userid=input.nextLine();
		System.out.println("enter the Password");
		password=input.nextLine();
	
	}
	}
