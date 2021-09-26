package javaNumberPrograms;

import java.util.Scanner;

public class Num_3_rangeforsunnyNumber {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the starting NUmber : ");
			int n=sc.nextInt();
			
			System.out.println("Enter Last Number : ");
			int x= sc.nextInt();
			
			System.out.println("Printing The sunny Number : ");
			for (int i=n;i<x+1;i++) {
				if (Math.sqrt(i+1)%1==0) {
					System.out.println(i);
				}
			}
		}
	}

}
