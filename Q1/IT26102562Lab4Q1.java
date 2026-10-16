import java.util.Scanner;

public class IT26102562Lab4Q1
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		double num = input.nextDouble();
		
		if (num>0)
		{
			System.out.print("The number is: Positive");
		}
		else if (num<0)
		{
			System.out.print("The number is: Negative");
		}
		else
		{
			System.out.print("The number is Zero");
		}
	}
}