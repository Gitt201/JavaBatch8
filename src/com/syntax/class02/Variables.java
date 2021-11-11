package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		/*create a java program and name it Variables
		 * a)In your program create different types of variables to 
		 * store student's information (name,last name, grade,
		 * city, state, phone number) and then print values of 
		 * those variables in the format:
		 * My name is _ and my last name is_
		 * I am A/B student
		 * I live in city _ and state _ 
		 * And my phone number is ..
		 * b)Change student's city, state, phone number, and grade.
		 * And print those updated values:
		 * Example:
		 * My name is _ and I moved to new city _ and new state_.
		 * My new phone number is _
		 */

		String name="Emily";
		String lastName="Evens";
		char grade='A';
		String city="Oakton";
		String state="New york";
		Long phoneNumber=1232342222l;
		
		System.out.println("My name is "+name+" and my last name is "+lastName);
		System.out.println("I am "+grade+" student");
		System.out.println("I live in city "+city+" and state "+state);
		System.out.println("And my phone number is "+phoneNumber);
		
		city="Ashburn";
		state="Virginia";
		phoneNumber=399959302004l;
		grade='C';
		
		System.out.println("My name is "+name+" and I moved to new city "+city+" and new state "+state+".");
		System.out.println("My new phone number is "+phoneNumber);
		
		
	}

}
