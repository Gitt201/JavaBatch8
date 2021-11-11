package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean vaccine = false;

		boolean secondDose = false;

		if (vaccine) { // yes 
			System.out.println("Let's check how many doses you got"); //outter if 

			if (secondDose) {
				System.out.println("You are fully vaccinated"); //inner if 
			}else { //
				System.out.println("YOu will need to get a 2nd dose"); //inner if 
			}

			System.out.println("End of if block"); //outter if 
		}
		
		System.out.println("----- Another example of nested if -----------------");
		
		/*every friday is a movie day 
		 * if it is the 13th --> you want to watch a scary movie
		 */
		
		int day=13;
		boolean isFriday=true;
		
		if(isFriday) {
			System.out.println("I am going to watch a movie"); //outter if 
			
			if(day==13) {
				System.out.println("Yay, I am watching a scary movie"); //inner if 
			}else {
				System.out.println("I am watching a action movie"); //inner if 
			}
			
		}else {
			System.out.println("It's a study day "); //outter if 
		}
		
		
		System.out.println("End of the code"); //outside the main block 

	}

}
