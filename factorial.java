package javapoint;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = s.nextInt();
		int f=1;

		for(int j=1;j<=a;j++)
		{
			f=f*j;
		}
		System.out.println(f);
		

	}

}
