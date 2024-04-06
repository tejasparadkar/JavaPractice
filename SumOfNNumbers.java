package javapoint;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = s.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
