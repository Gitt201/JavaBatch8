package com.syntax.reviewclass03;

public class LogicalAnd {

	public static void main(String[] args) {
		
		int number=0;
		
		if(number>0)  {
			if(number<=100) {
				System.out.println("Number is between 0 and 100");
			}else {
				System.out.println("Numebr is not between 0 and 100");
			}
			
		}else {
			System.out.println("Number is not between 0 and 100");
		}

		if(number>=0 && number<=100) {
			System.out.println("Number is between 0 and 100");
		}else {
			System.out.println("Number is not betwen 0 and 100");
		}
	}

}
