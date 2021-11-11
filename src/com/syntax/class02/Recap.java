package com.syntax.class02;

public class Recap {

	public static void main(String[] args) {

		byte b = 1;
		short s = 10;
		int i = 100; // declare variable and we assign the value
		long l = 1000;
		float f = 10.99f;
		double dd = 100.99;

		char c = '*';
		boolean bool = false;

		System.out.println(dd);

		// how to change a value of the variable?

		// int i=200; we cannot declare same variable twice!!!

		i = 200; // reassign value
		bool = true;
		System.out.println(bool);

		// can I do this?
		int number = i;

		System.out.println(number); // 200

		number = 500;
		System.out.println(number);

		// number=1.99; error: type mismatch! Why - variable number can hold only
		// integer type of value

		float num = 1.99f;

	}
}
