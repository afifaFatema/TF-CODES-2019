package assignmentsWinter19;

import java.util.Scanner;

public class AssignmentThreePartFour {

	public static void main(String[] args) {
		
		String original, reverse = "";  
	      Scanner pal = new Scanner(System.in);   
	      System.out.println("Enter a string or a number to check if it is a palindrome:");  
	      original = pal.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string or number is a palindrome.");  
	      else  
	         System.out.println("Entered string or number isn't a palindrome.");   
	}

}
