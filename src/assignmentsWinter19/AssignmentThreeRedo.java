package assignmentsWinter19;

import java.util.Scanner;

public class AssignmentThreeRedo {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int num1 = userInput.nextInt();
		
		Scanner userInputThree = new Scanner(System.in);
		String x = userInputThree.nextLine();
		
		Scanner userInputTwo = new Scanner(System.in);
		int num2 = userInputTwo.nextInt();
		
		if(x.equals("+")){
			add(num1,num2);
		}
		else{
			System.out.println();
		}
		
		if(x.equals("-")){
			sub(num1,num2);
			}
		else {
			System.out.println();
		}
		
		if(x.equals("*")){
			multiply(num1,num2);
		}
		else{
			System.out.println();
		}
		if(x.equals("/")){
			div(num1,num2);
		}
		else{		
			System.out.println();}
		}
	public static void add(int num1, int num2){
		System.out.println(num1+num2);
	}
	public static void sub(int num1, int num2){
		System.out.println(num1-num2);
	}
	public static void multiply(int num1, int num2){
		System.out.println(num1*num2);
	}
	public static void div(int num1, int num2){
		System.out.println(num1/num2);
	}
	public static void x(){
		System.out.println();}
}
