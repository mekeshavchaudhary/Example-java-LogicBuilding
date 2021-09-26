package javaNumberPrograms;

import java.util.Scanner;

public class Num_1_AutomorphicNumbers {
	public static void main(String[] args) {
		int num,rem,x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check: ");
		num=sc.nextInt();
		x=num*num;
		int l=("" + num).length();
		rem = x%(int)Math.pow(10, l);
		if (rem==num) {
			System.out.println("This is an automorphic number");
		}
		else {
			System.out.println("This is not an automorphic number");
		}
			
		
		
	}
	

}
