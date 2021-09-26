package javaNumberPrograms;

import java.util.Scanner;

public class Num_3_SunnyNumber {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to check");
		n= sc.nextInt();
		
		if(Math.sqrt(n+1)%1==0) {
			System.out.println("This Number is a Sunny Number");
		}
		else {
		    System.out.println("This is not a Sunny Number");
		}
	}

}
