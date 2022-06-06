package Q4;

import java.util.Scanner;
import java.util.regex.*;

public class Demo {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		
		Scanner scanner = new Scanner(System.in);
		
		try {
		System.out.println("Enter User name");
		String username = scanner.next();
		Pattern userPat = Pattern.compile("[a-zA-Z]{3,8}$");
		Matcher userMat = userPat.matcher(username);
		boolean userFind =  userMat.find();
		if(userFind) {
			c1.setUsername(username);			
		}
		else {
			System.out.println("please enter a valid user name");
			throw new ArithmeticException();
		}
		System.out.println("Enter password");
		String pwd = scanner.next();
		Pattern passPat = Pattern.compile("[a-zA-Z0-9]{3,8}$");
		Matcher passMat = passPat.matcher(pwd);
		boolean passFind =  passMat.find();
		if(passFind) {
				
			c1.setPassword(pwd);
		}
		else {
			System.out.println("please enter a valid password");
			throw new ArithmeticException();
		}
		System.out.println("Enter mobile number");
		String mob = scanner.next();
		Pattern mobPat = Pattern.compile("[6789]{1}[0-9]{9}$");
		Matcher mobMat = mobPat.matcher(mob);
		boolean mobFind =  mobMat.find();
		if(mobFind) {
			c1.setMobileNumber(mob);
		}
		else {
			System.out.println("please enter a valid mobile number");
			throw new ArithmeticException();
		}
		System.out.println("Enter Email ID");
		String email = scanner.next();
		Pattern emailPat = Pattern.compile("[.com]{4}$");
		Matcher emailMat = emailPat.matcher(email);
		boolean emailFind =  emailMat.find();
		if(emailFind) {
				
			c1.setEmail(email);
		}
		else {
			System.out.println("please enter a valid email Id");
			throw new ArithmeticException();
		}
		}
		catch(ArithmeticException e) {
			
			System.out.println(e);
			System.out.println("you did not enter the correct details, please try again");
		}
		
	}

}
