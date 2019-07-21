package assignmentsWinter19;

import java.util.Scanner;

public class AssignmentThreePartFive {

	public static void main(String[] args) {
		System.out.println("Please enter a number:");
		
		Scanner numbers = new Scanner(System.in);
		int oddeven = numbers.nextInt();
		
		if(oddeven % 2 == 1){
			System.out.println("Entered number is odd.");
		}
		
		else {
			System.out.println("Entered number is even.");
		}

	}

}
