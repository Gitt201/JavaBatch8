package com.syntax.reviewclass03;

public class LogicalOperators {

	public static void main(String[] args) {
		
		String day="Sunday";
		if(day.equalsIgnoreCase("Sunday")) {
			System.out.println("Relax its weekend just don't blink or it will be over");
			
		}else if(day.equalsIgnoreCase("Saturday")) {
			System.out.println("Relax its weekend just don't blink or it will be over");
		
		}else {
			System.out.println("Go to work");
		}

		if(day .equalsIgnoreCase("Sunday") || day.equalsIgnoreCase("Saturday")) {
			
		} else {
			System.out.println("Go to work");
		}
	}

}
