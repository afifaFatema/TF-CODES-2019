package assignmentsWinter19;

import java.util.Scanner;

public class AssignmentThreePartThree {

	public static void main(String[] args) {
	
		 {
		        int num1;
		        int num2;
		        String operation;
		        char operator;
		        
		        Scanner calhw = new Scanner(System.in);

		        System.out.println("Please enter the first number:");
		        num1 = calhw.nextInt();

		        System.out.println("Please enter the second number:");
		        num2 = calhw.nextInt();

		        System.out.println("Please enter operation:");
		        operator = calhw.next().charAt(0);
		        
		        int Answer = 0;
				switch (operator) {
		        case '+': Answer = num1 + num2;
		        		  break;
		        case '-': Answer = num1 - num2;
		        		  break;
		        case '*': Answer = num1 * num2;
		        		  break;
		        case '/': Answer = num1/num2;
		                  break;
		                  		        
		        }
		        System.out.println(num1+" "+operator+" "+num2+"="+" "+Answer);
		        }
		
		 }
		 }
	
		        

		        