// Q2

import java.util.Scanner;

public class IT26300584Lab4Q2
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter exam marks (out of 100): ");
		double examMarks = input.nextDouble();
		
		
		if (examMarks >= 100 || examMarks <= 0 )
		{
			System.out.println("Invalid input for exam marks. Terminating program");
			return; //exit program
		}
		
		
		System.out.print("Please enter lab submission marks (out of 100): ");
		double labMarks = input.nextDouble();
	
		if (labMarks >= 100 || labMarks <= 0)
		{
			System.out.println("Invalid input for lab marks. Terminating program");
			return; //exit program
		}
	
		
		System.out.print("Please enter the percentage given for the exam: ");
		double examPercentage = input.nextDouble();
		
		System.out.print("Please enter the percentage given for the lab submission : ");
		double labPercentage = input.nextDouble();
		
		
		double percentageSum = examPercentage + labPercentage ;
		
		if (percentageSum != 100)
		{
			System.out.println("The percentages must add up to 100. Terminating program");
			return; //exit program
		}
		
		
		examPercentage /= 100;
		labPercentage /= 100;
		
		
		double finalMark = (examMarks * examPercentage) + (labMarks * labPercentage);
		
		System.out.println("The Final mark is : " + finalMark);
	}
}