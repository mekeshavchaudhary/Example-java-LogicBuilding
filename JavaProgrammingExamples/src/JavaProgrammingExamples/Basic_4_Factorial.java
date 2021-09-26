package JavaProgrammingExamples;

import java.util.Scanner;

public class Basic_4_Factorial {
	public static void main(String[] args) {
		Scanner fact = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = fact.nextInt();
		int multi=1;
		for (int i=n;i>0;i--) {
			multi=multi*i;
		}
		System.out.println(multi);
	}

}
