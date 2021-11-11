package com.syntax.class06;

import java.util.Scanner;

public class TaskGrade {

	public static void main(String[] args) {
		
		/*Allow user to enter grade and then provide
		 * explanation: A-Excellent, B-Good, C-Average,
		 * D-Bad, and other grade --> Not acceptable. At the 
		 * end your program should print which grade was 
		 * entered by a user with explanation
		 */

	Scanner scan;
	char grade;
	String explanation; 
	
	scan=new Scanner(System.in);
	System.out.println("Please enter your grade");
	grade=scan.next().charAt(0);
	
	switch(grade) {
	
	case 'A':
		explanation="Excellent";
		break;
	case 'B':
		explanation="Good";
		break;
	case 'C':
		explanation="Average";
		break;
	case 'D':
		explanation="Bad";
		break;
	default:
		explanation="Not Acceptable";
		break;
	}
	System.out.println("Your "+grade+" is "+explanation);
		
		
	}
}
