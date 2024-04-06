package javapoint;

import java.util.Scanner;

public class CheckPositiveNegative {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=s.nextInt();
		if(a>=0)
		{
			System.out.println("Positive number");
		}
		else
		{
			System.out.println("Negative number");
		}
	}

}
