package JavaProgrammingExamples;

import java.util.Scanner;
 
public class Basic_2_Primenumber {
	public static void main(String[] args) {
		System.out.println("ENter your number : ");
		Scanner Prime = new Scanner(System.in);
		int n = Prime.nextInt();
		boolean x = false;
		if (n==0 || n==1) {
			System.out.println("It is not a Prime Numer");
			x= false;}
		else {
		for (int i = 2; i < n; i++) {
	    if(n%i==0) {
				x=true;
				break;
			}
		}
		if (!x) {
			System.out.println("The Number is Prime");
		}
		else {
			System.out.println("Number is not Prime");
		}
		}
		
	}

}
