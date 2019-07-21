package assignmentsWinter19;

import java.util.Scanner;

public class AssignmentThreePartOne {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner partone = new Scanner(System.in);
		int a = partone.nextInt();
		
		for(int i=0; i<=a; i +=4){
		
			if(i==0) {
					System.out.print(i+1 + ",");
			continue;
		}
			System.out.print(i+ ",");
	}

}}
