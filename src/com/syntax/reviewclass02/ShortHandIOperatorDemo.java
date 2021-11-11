package com.syntax.reviewclass02;

public class ShortHandIOperatorDemo {

	public static void main(String[] args) {
		

		int number=10;
		number+=20;
		System.out.println(number);
		number+=20+30;
		System.out.println(number);
		//number+=number+50;
		number=number+number+50;
		System.out.println(number);
	}

}
