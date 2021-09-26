package javaNumberPrograms;

import java.util.Scanner;

public class Num_5_FascinatingNumber {
	public static void main(String[] args) {
		int n;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enetr any number to check(Must greater than 3 digit) : ");
			n= sc.nextInt();
		}
		if(n<=99) {
			System.out.println("Not Greater then 3");
		}
		else {
			int num [];
			num = new int[10];
			
			int temp ;
			int dig;
			
			for(int i=1;i<4;i++) {
				temp=n*i;
				while(temp>0) {
					dig =temp%10;
					temp /= 10;
					num[dig]=1;					
				}
			}
			int flag=1;
			for (int j=1;j<10;j++) {
					if (num[j]==0) {
							flag=0;
					}
			}	
			if (flag==0) {
				System.out.println("Not Facinating");
			}
			else {
				System.out.println("Fascinating");
			}
			
		}
	}
}


