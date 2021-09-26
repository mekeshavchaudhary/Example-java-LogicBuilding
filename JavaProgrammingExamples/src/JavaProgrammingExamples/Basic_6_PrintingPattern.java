package JavaProgrammingExamples;

import java.util.Scanner;

public class Basic_6_PrintingPattern {
	public static void main(String[] args) {
		Scanner pat =new Scanner(System.in);
		int n= pat.nextInt();
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<i;j++)
				System.out.print("* ");
			    System.out.println();
		}
		System.out.println();
	}

}
