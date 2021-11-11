package com.syntax.class06;

import java.util.Scanner;

public class TaskCountry {

	public static void main(String[] args) {
		
		/*Ase user to enter their country and capture it. 
		 * Once vaules are captured print which language 
		 * user speaks.
		 */
		
		Scanner scan;
		String country; 
		String language;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
  switch(country) {
		
		case "America":
			language="English";
			break;
		case "Canada":
			language="French";
			break;
		case "Iran":
			language="Persian Farsi";
			break;
		case "Spain":
		language="Spanish";
		break;
		case "Ireland":
			language="English";
			break;
		case "China":
			language="Mandarin";
			break;
		default:
		 	language="Error";
		}
     System.out.println("The language spoke is "+language);
		
	}
}
