// Q3

import java.util.Scanner;

public class IT26300584Lab4Q3
{
	public static void main(String[]args)
	{
		String message;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		
		message = (num > 0)? "The number is : Positive":
		(num < 0)?"The number is : Negetive":
		"The number is Zero";
		
			System.out.println(message);
		
	}
}