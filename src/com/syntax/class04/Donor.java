package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {

		
		int age=18;
		double weight=100;
		
		if(age>=18) {
			System.out.println("You are eligible and check your weight");
			
			if(weight>110) {
				System.out.println("You are eligible");
			}else {
            System.out.println("Sorry you do not match the requirment");
			}
		}else {
			System.out.println("Sorry your not 18 or older");
		}
	}

}
