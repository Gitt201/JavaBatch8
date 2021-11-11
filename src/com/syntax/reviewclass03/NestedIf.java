package com.syntax.reviewclass03;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		String pass;
		double accountBalance=1000;
		Scanner  scan=new Scanner(System.in);
		double transferAmount=500;
		System.out.println("Welcome to Syntax Bank Please Enter your password");
        pass=scan.nextLine();
        
        if("pass123".equals(pass)) {
        	System.out.println("Please enter the amount that you want to tranfer");
        	transferAmount=scan.nextDouble();
        	if(transferAmount>accountBalance) {
        		System.out.println("Not enough funds");
        	}else {
        		System.out.println("Transfered remaining balance " + (accountBalance - transferAmount));
        	}
        }else {
        	System.out.println("Sorry try again Invaild credentials");
        }
		
        
	}

}
