package com.syntax.class04;

import java.util.Scanner;

public class CompareNumbers {

	public static void main(String[] args) {
		
		
		Scanner data=new Scanner(System.in);
		
		System.out.println("Please enter first number");
		int num1=data.nextInt();
		
		System.out.println("Please enter second number");
		int num2=data.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		}else if(num2>num1) {
			System.out.println(num2+" is larger than "+num1);
		}else {
			System.out.println(num1+" is equal to "+num2);
		}
		
		
		
	}

}
