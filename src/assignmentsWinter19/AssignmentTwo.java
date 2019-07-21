package assignmentsWinter19;

import java.util.Scanner;

public class AssignmentTwo {

	public static void main(String[] args) {
		System.out.println("Please enter string:");
		
		Scanner userInput = new Scanner(System.in);
		String abc = userInput.nextLine();
		
		System.out.println(abc.toUpperCase());
		System.out.println(abc.length());
		String xyz = abc.replace("o","z").toUpperCase();
		System.out.println(xyz);
		System.out.println(xyz.substring(4).toUpperCase());
		System.out.println(abc.concat(" Test"));
	}

}
