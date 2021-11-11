package com.syntax.homework;

public class replitHomework01 {

	public static void main(String[] args) {

		/*
		 * Create two boolean variables named isTrue and isFalse respectively. Assign a
		 * true value to isTrue variable and false value to isFalse variable. Print the
		 * value of each variable. answer: true false
		 */

		boolean isTrue = true;
		boolean isFalse = false;

		System.out.println(isTrue);
		System.out.println(isFalse);

		System.out.println("------------------------------------------------------------------");

		/*
		 * Create a variable age that will hold an integer value Assign the value of 4
		 * to it Print the value of the variable Answer: 4
		 */

		int age1 = 4;

		System.out.println(age1);

		System.out.println("--------------------------------------------");

		/*
		 * Create a variable called "myBoolean" and set it to false Create a variable
		 * called "money" and set it to 99999.99 Print value of variable "money" On same
		 * line print value of the variable "myBolean" Answer: 99999.99false
		 */

		boolean myBoolean = false;
		double money = 99999.99;

		System.out.print(money);
		System.out.println(myBoolean);

		System.out.println("-----------------------------");

		char var1 = '*';
		char var2 = '#';

		System.out.println(var1);

		System.out.print(var1);
		System.out.println(var1);

		System.out.print(var1);
		System.out.print(var1);
		System.out.println(var1);

		System.out.print(var2);
		System.out.println(var2);

		System.out.println(var2);

		System.out.println("------------------------------------");

		/*
		 * Create a String variable "name" and assign a value of "Chen" to it Create an
		 * integer variable "age" and assign a value of 50 to it Create an integer
		 * variable "iq" and assign the value of age to it (do NOT use ' = 50') Print
		 * the value of a name Print the value of "age" and the value of "iq" on the
		 * same line. Answer:Chen 5050
		 */

		String name = "Chen";
		int age = 50;
		int iq = age;

		System.out.println(name);
		System.out.print(age);
		System.out.println(iq);

		System.out.println("-----------------");

		/*
		 * Create a variable and assign the value of "John" to it. Create a variable and
		 * assign the value of "Smith" to it. Answer: John Smith
		 */

		String var3 = "John";
		String var4 = "Smith";

		System.out.println(var3 + " " + var4);

		System.out.println("-------------------------");

		/*
		 * Declare a variable and assign the value of "Java" to it. Declare a variable
		 * and assign the value of "programming language" to it. Concatenate both
		 * Strings and output should look like as below. Answer: Java is the #1
		 * programming language
		 */

		String var5 = "Java";
		String var6 = "programming language";

		System.out.println(var5 + " is the #1 " + var6);

		System.out.println("----------------------");

		/*
		 * Create 2 Strings Use the concatenation operation to make the following output
		 * Answer: syntaxtechs.com
		 */

		String var7 = "syntaxtechs";
		String var8 = ".com";

		System.out.println(var7 + var8);

		System.out.println("---------------------------------");

		/*
		 * Create a float data type variable and assign a value of 8.2 to it Multiply
		 * the value by itself and print the result. Answer: The multiplication of ___
		 * with itself is equal to ____
		 * 
		 */

		float var9 = 8.2f;
		float result = var9 * var9;

		System.out.println("The multiplication of " + var9 + " with otself is equal to " + result);

		System.out.println("-------------");

		/*
		 * Declare 2 numbers and assign values 200 and 100 respectively. First, add
		 * numbers, then subtract, third multiply, forth divide. Please use variables to
		 * print the values of each operation result on a separate line. Answer: 300 100
		 * 20000 2
		 */

		int num1 = 200;
		int num2 = 100;

		int add = num1 + num2;
		int sub = num1 - num2;
		int mult = num1 * num2;
		int div = num1 / num2;

		System.out.println(add);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);

		System.out.println("---------------------------");

		/*
		 * Write a program to print the perimeter and area of a rectangle with width = 5
		 * and height = 8. Answer: The perimeter of a rectangle with width __ and height
		 * __ is equals to __ and the area equals to __
		 */

		int width = 5;
		int height = 8;
		int perimeter = 2 * (height + width);
		int area = width * height;

		System.out.println("The perimeter of rectangle with width " + width + " and height " + height + " is equals to "
				+ perimeter + " and the area equals to " + area);

		System.out.println("----------------------------------");

		/*
		 * Add num1 and num2 Divide the result by num3 Subtract num4 from that result
		 * Instructions: Please use variables to assign the result of arithmetic
		 * operations
		 * Answer: The result of arithmetic operations is equal to ___
		 */

		int numm1=4;
		int numm2=50;
		int numm3=150;
		int numm4=40;
		
		int add1=numm1+numm2;
		int result1=numm3/add1;
		int result2=numm4-result1;
		
		System.out.println("The result of artithmetic operations is equal to "+result2);
		
		
		
	}

}
