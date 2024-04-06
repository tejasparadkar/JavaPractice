package javapoint;

import java.util.Scanner;

public class PerfectSquare 
{
	static boolean checkPerfectSquare(double a)    
	{   
		double sqrt=Math.sqrt(a);   
		return ((sqrt - Math.floor(sqrt)) == 0);   
	}   
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double a=s.nextDouble();
		if(checkPerfectSquare(a))
		{
			System.out.println("Perfect Square");
		}
		else
		{
			System.err.println("Not a perfect square");
		}
	}
}
