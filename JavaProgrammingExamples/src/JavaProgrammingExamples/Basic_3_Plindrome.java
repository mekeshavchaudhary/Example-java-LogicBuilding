package JavaProgrammingExamples;

import java.util.Scanner;

public class Basic_3_Plindrome {
	public static void main(String[] args) {
		int n=121;
		int sum=0;
		int x=n;
		
		while(n!=0) {
			int remainder =n%10;
			sum=sum*10+remainder;
			n =n/10;
		}
		if (x==sum) {
			System.out.println("This is a plindrome number");
		}
		else {
		System.out.println("This is not a plindrome number");
		}
		
	}

}
