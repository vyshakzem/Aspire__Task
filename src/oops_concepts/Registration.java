package oops_concepts;

import java.util.Scanner;

public class Registration {
static String firstname;
static String secondname;
static String  emailid;
static String mobilenumber;
static public void signin() {
	Scanner registerscanner=new Scanner(System.in);
	System.out.println("Enter your first Name");
	firstname=registerscanner.next();
	System.out.println("ENTER your last Name");
	secondname=registerscanner.next();
	System.out.println("Enter your emailid");
	emailid=registerscanner.next();
	System.out.println("Enter your MobileNumber");
	mobilenumber=registerscanner.next();
	
	
} 
public static void main(String args[]) {
	Login_page login=new Login_page();
	login.signin();
	
}
}
