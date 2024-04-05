package javapoint;

import java.util.Scanner;

public class PalindromeInt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r;
		int sum=0;
		System.out.println("Enter a number to check palindrome");
		int c = s.nextInt();
		int temp=c;
		while(c>0)
		{
			r=c%10;
			sum=(sum*10)+r;
			c=c/10;
		}
		if(temp==sum)
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
	}

}
