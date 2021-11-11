package com.syntax.class05;

import java.util.Scanner;

public class NestedIfRecap {

	public static void main(String[] args) {
		
		/*
		 * write a program to ask if user got a visa 
		 * If user got a visa let's ask how long is visa for
		 */

		Scanner scan;
		boolean visa;
		int years;
		
		scan=new Scanner(System.in);
		System.out.println("Hey, did you get your visa");
		
		visa=scan.hasNextBoolean();
		
		if(visa) {
			System.out.println("Congratulations, how long is your visa for");
			
			years=scan.nextInt();
			
			if(years>1) {
				System.out.println("That is awesome");
			}else {
				System.out.println("you will have to go back in 1 year and to apply again  ");
			}
			
		}
	}

}
