package com.syntax.reviewclass03;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		/*
		 * Homework: Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/,).
		 * Based on operator provide the result to user.
		 */

		int num1;
		int num2;
		char operation;
		int results=0;
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Please enter two numbers");
		 num1=scan.nextInt();
		 num2=scan.nextInt();
		 System.out.println("Please enter the operation + - / * ");
		 operation=scan.next().charAt(0);
		 
		 if(operation=='+') {
			 results=num1+num2;
		 }else if (operation=='-') {
			 results=num1-num2;
		 }else if (operation=='*'){
			 results=num1*num2;
		 }else if (operation=='/') {
			 results=num1/num2;
		 }else {
			 System.out.println("Invaild operation");
		 }
			 
		 System.out.println(results);
		
		 switch(operation) {
		 case'+':
			 results=num1+num2;
			 break;
			 
		 case'-':
			 results=num1-num2;
			 break;
			 
		 case '*':
			 results=num1*num2;
			 break;
			 
		 case '/':
			 results=num1/num2;
			 break;
			 default:
				 System.out.println("Invalid operation");
		 }
		System.out.println(results);

		double marks=100;
		if(marks>90 && marks<=100) {
			System.out.println("A");
		}
		
		String name=null;
		int number=10;
		if(number==10) {
			name="Maria";
		}else {
			
		}
		System.out.println(name);
	}

}
