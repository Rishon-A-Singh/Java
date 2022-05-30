package Question3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		OLA c1 = new OLA();
		Scanner input =new Scanner(System.in);
		System.out.println("input the number of People");
		int passengers = input.nextInt();
		System.out.println("input the number of Km");
		int kms = input.nextInt();
		Car c2 = c1.bookCar(passengers, kms);
		c2.setNumberOfKms(kms);
		c2.setNumberOfPassengers(passengers);
	}

}
