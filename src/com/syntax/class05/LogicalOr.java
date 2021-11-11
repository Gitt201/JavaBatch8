package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		/*define a day
		 * if day is Monday or Friday --> no class
		 * if day is Tuesday or Wednesday --> Manual Class
		 * if day is Thursday --> review class
		 * if day is Saturday or Sunday --> Java class
		 */
		
		String day="Tuesday";
		
		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("We have no class at Syntax");
			
		}else if (day.equals("Tuesday") || day.equals("Wednesday")){
			System.out.println("Today is manual class");
			
		}else if (day.equals("Thursday")) {
			System.out.println("Today is our review class");
			
		} else if (day.equals("Saturday") || day.equals("Sunday")){
			System.out.println("Review class");
		}else {
		System.out.println("Please specify valid day");	
		}

		
	}

}
