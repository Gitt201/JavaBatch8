package com.syntax.class03;

public class WhatHappens {

	public static void main(String[] args) {

		// int i=1.99; error

		int i = (int) 1.99; // narrowing or explicit casting
		System.out.println(i); // 1

		double d = 1; // widening or implicit casting
		System.out.println(d); // 1.0

		byte b = (byte) 128; // narrowing
		System.out.println(b);

		int num = 20;
		int num1 = 3;

		System.out.println(num / num1);

		double num2 = 20;
		double num3 = 3;

		System.out.println(num2 / num3);

		//float f = 10.99f;
		//double number = 10.99;

		//int t = 100;

		int n1 = 20;
		int n2 = 3;
		double dd = (byte) n1 / n2;
        System.out.println(dd);
	 }

}
