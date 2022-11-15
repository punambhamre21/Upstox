package Logical_Programs;

import java.util.Scanner;

public class Accept_input_from_user {
	
public static void main (String[] args) {
	
	Scanner scan = new Scanner (System.in);//get first number from user
	System.out.println("user enter 1st number");
	
	int num1=scan.nextInt();//get second number from user
	System.out.println("user enter 2nd number");
	
	int num2=scan.nextInt();//add to numbers
	System.out.println(num1+num2);
	
	
	
}
}
