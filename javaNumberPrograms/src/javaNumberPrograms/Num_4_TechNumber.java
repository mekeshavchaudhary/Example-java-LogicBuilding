package javaNumberPrograms;

import java.util.Scanner;

public class Num_4_TechNumber {
	public static void main(String[] args) {
		int num,x,y;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number to check: ");
			num = sc.nextInt();
		}
		int l = ("" + num).length();
		x= num%(int)Math.pow(10, l/2);
		y= num/(int)Math.pow(10, l/2);
		int z= x+y;
		
		if (l%2 !=0)
		{
			System.out.println("You didnt choose an even number");
		}
		else {
			if(num==(z*z)) {
				System.out.println("This is a Tech Number");
			}
			else {
				System.out.println("This is not a tech number");
			}
		}
		
		
	}

}
