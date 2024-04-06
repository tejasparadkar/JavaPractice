package javapoint;
//largest of three numbers
import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int a = s.nextInt();
		System.out.println("Enter number 2: ");
		int b = s.nextInt();
		System.out.println("Enter number 3: ");
		int c = s.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("Largest number is "+a);
			}
		}
		else if(b>c)
		{
			System.out.println("Largest number is "+b);
		}
		else
		{
			System.out.println("Largest number is "+c);
		}
	}

}
