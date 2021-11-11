package com.syntax.class02;

public class ShorthandIOperators {

	public static void main(String[] args) {
		
		int num=20;
		num=num+100;
		
		System.out.println(num);//120
		
		num=num-60;
		System.out.println(num);//60 reassigned 
		
		int number=100;
		number+=100;//shorter way to write out an addition equation number =number+100
		
		System.out.println(number);

		number-=30;//number =number-30
		System.out.println(number);
		
		number/=10;
		System.out.println(number);
		
		number*=2;
		System.out.println(number);
	}

}
