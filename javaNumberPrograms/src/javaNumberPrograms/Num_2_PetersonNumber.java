package javaNumberPrograms;

import java.util.Scanner;

public class Num_2_PetersonNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check : ");
		int num,temp=0,rem, sum=0,multi=1;
		num =sc.nextInt();
		num=temp;
		
		while(num>0) {
			rem=num%10;
			for(int i=rem;i>0;i--) {
				multi = multi*i;
			}
			sum= sum + multi;	
		}
		if (sum==temp) {
			System.out.println("This is a Peterson Number");
		}
		else {
			System.out.println("This is not a peterson number");
		}
	}

}
