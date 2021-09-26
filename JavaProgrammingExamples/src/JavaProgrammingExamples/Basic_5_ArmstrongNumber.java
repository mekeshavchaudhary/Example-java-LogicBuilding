package JavaProgrammingExamples;

import java.util.Scanner;

public class Basic_5_ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter any number : ");
		int n,rem,sum=0,temp,x;
		boolean b=false;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		x=n;
		
		while(n !=0) {
			rem=n%10;
			sum = sum+(rem*rem*rem);
			n=n/10;
		}
		if (x==sum) {
			System.out.println("This number is an armstrong Number");
		}
		else {
			System.out.println("This is not an armstrong NUmber");
		}
	}

}
