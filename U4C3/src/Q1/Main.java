package Q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
		
		System.out.println("Enter the number of elements in the array");
		int length = scan.nextInt();
		int[] userArray = new int[length];
		System.out.println("Enter the elements in the array");
		for(int i = 0 ; i<length; i++) {
			userArray[i] = scan.nextInt();
		}
		
		System.out.println("Enter the index of the array element you want to access");
		
		int wantToAccess = scan.nextInt();
		System.out.println("The array element at index " + wantToAccess + " = " + userArray[wantToAccess]);
		System.out.println("the element successfully accessed");
		
//		for(int j = 0; j<length; j++) {
//			
//			System.out.println(userArray[j]);
//		}
		
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("This index does not exist in the array");
		}
		catch(NumberFormatException n) {
			System.out.println(n);
			System.out.println("This is not a number");
		}
		catch(InputMismatchException i) {
			System.out.println(i);
			System.out.println("There is some issue with the input");
		}

	}

}
