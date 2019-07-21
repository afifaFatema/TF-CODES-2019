package javaBootcampExamples;

import java.util.Scanner;

public class JavaPalindromExample {

	public static void main(String[] args) {
		String a, b = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a String: ");
		a = s.nextLine();
		int n = a.length();
		for(int i = n - 1; i >= 0; i--)
		{
			b = b + a.charAt(i);
		}
		if(a.equalsIgnoreCase(b))
		{ System.out.println("The String is palindrome!");
		
		}
		else {
			System.out.println("The String is not a palindrome!");
		}
	}

}
