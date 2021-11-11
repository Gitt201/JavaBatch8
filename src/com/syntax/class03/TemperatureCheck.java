package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {

      /*Create a Java program and name it Temperature Check. Create variable to store temperature.
       *  Your program should check if temperature is below 32 
       *  then it should print “Water will freeze with temperature __“, 
       *  otherwise “Water will NOT freeze with temperature __“. 
       */

		int temp=75;
		
		if (temp<32) {
			System.out.println("Water will freeze with temperature "+temp);
		}else {
				System.out.println("Water will NOT freeze with temperature "+temp);
			}
		
		System.out.println("---------------------------------------------------------------------------------");
		
		/*if it is a break time --> I will get my coffee
		 * otherwise I will focus on the class 
		 */
		boolean isBreakTime=false;
		
		if (isBreakTime) {
			System.out.println("I will get a coffee");
		}else {
			System.out.println("Otherwise I will focus on the class");
		}
		
		/*if you are hungry --> I will go eat 
		 * otherwise: I will go have a tea 
		 */
		
		boolean isHungry=true;
		
		if (isHungry) {
			System.out.println("I will go eat");
		}else {
			System.out.println("I will go have tea");
		} 
		
		int num1=20;
		int num2=20;
		
		if (num1>num2) {
			System.out.println("num1 is lager than num2");
		}else {
			System.out.println("num2 is larger than num1");
		}
		
		
			
			
		}
	}


