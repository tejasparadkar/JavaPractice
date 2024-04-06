package javapoint;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = s.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}

}
