package Q2;
import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) throws InvalidCountryException{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name:");
		String userName = scan.next();
		System.out.println("enter your country");
		String userCountry = scan.next();
		try {
			if (userCountry == "India") {
				System.out.println("User registration successfully");
			}
			else {
				InvalidCountryException ice = new InvalidCountryException("wrong country");
				throw ice;
			}
		}
		catch(InvalidCountryException ice) {
			System.out.println(ice);
			System.out.println("wrong country sorry");
		}
		
		
		
		
	}

}
