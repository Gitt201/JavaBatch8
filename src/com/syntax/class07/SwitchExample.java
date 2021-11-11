package com.syntax.class07;

public class SwitchExample {

	public static void main(String[] args) {
		
		String month="January";
		
		//if month is december -->frebruary-->winter
		//if month is march or april or may --> spring
		
		switch(month) {
		
		case "December":
		case "January":
		case "Febuary":
			System.out.println("Winter");
			break;
		case "March":
		case "April":
		case "May":
			break;
		case "June":
		case "July":
		case "August":
			System.out.println("Summer");
			break;
		}
	}

}
