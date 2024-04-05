package javapoint;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter a number to check: ");
		int a = s.nextInt();
		if(a%2==0)
		{
			System.out.println("Not a prime number");
		}
		else if(a==1||a%2!=0)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Enter correct number");
		}
	}

}
