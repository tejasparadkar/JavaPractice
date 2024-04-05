package javapoint;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String a;
		String reverse="";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string to check:");
		a=s.nextLine();
		int length = a.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+a.charAt(i);
		}
		if(a.equals(reverse))
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
		
	}

}
