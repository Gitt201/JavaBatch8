package com.syntax.class06;

import java.util.Scanner;

public class TaskHomework {

	public static void main(String[] args) {
		
		/*HomeWork: Using scanner class create 
		 * calculator. Allow user to enter 2 numbers and operator 
		 * Based on operator provide the 
		 * result to user 
		 */

		Scanner scan;
		
		char operator;
		double number1, number2;
		double result=0;
		
		scan=new Scanner(System.in);
		System.out.println("Choose an operator: +,-,*,/");
		operator = scan.next().charAt(0);
		
		System.out.println("Enter first number");
		number1=scan.nextDouble();
		
		System.out.println("Enter second number");
		number2=scan.nextDouble();
		
		switch (operator) {
		
		case '+':
			result= number1 + number2;
			break;
		case '-':
			result= number1 -number2;
			break;
		case '*':
			result= number1 * number2;
		break;
		case '/':
			result= number1 / number2;
			break;
			default:
				break;
		}
		System.out.println(result);
	}
}
