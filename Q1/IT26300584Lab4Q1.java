// Q1

import java.util.Scanner;

public class IT26300584Lab4Q1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		if(num > 0)
		{
			System.out.println("The number is : Positive");
		}
		else if (num < 0)
		{
			System.out.println("The number is : Negetive");
		}
		else
		{
			System.out.println("The number is Zero");
		}
	}
}