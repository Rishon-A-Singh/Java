package com.masai;

public class Vowel {
	
	void checkLetter(char a) {
		if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
			System.out.println("vowel");
		}
		else if(a == 'b' || a == 'c' || a == 'd' || a == 'f' || a == 'g' || a == 'h' || a == 'j' || a == 'k' || a == 'l' || a == 'm' || a == 'n' || a == 'p' || a == 'q' || a == 'r' || a == 's' || a == 't' || a == 'v' || a == 'w' || a == 'x' || a == 'y' || a == 'z') {
			System.out.println("consonant");
		}
		else
			System.out.println("invalid character");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowel t1 = new Vowel();
		char a = 'a';
		t1.checkLetter(a);
		a = 'x';
		t1.checkLetter(a);
		a = '-';
		t1.checkLetter(a);
			

	}

}
