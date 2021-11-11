package com.syntax.class06;

public class NoMoreExamples {

	public static void main(String[] args) {
		
		boolean isJavaEasy=false;
		
		if(!isJavaEasy) {
			System.out.println("Please try to spend more time with Java");
		}

		System.out.println("-------------------------------------------------");
		
		String day="Monday";
		
		if(!(day.contentEquals("Sunday") || day.equals("Saturday"))) {
			System.out.println("I am going to work");
		}
		
	}

}
