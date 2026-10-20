import java.util.Scanner;

public class IT26102739Lab4Q2
{
	
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter exam marks(out of 100): ");
		double examMark = input.nextDouble();
		
		if(examMark < 0 || examMark > 100)
		{
			System.out.println("Invalid input for the exam marks, Terminating program");
		}
		
		System.out.print("Please enter lab submission marks(out of 100): ");
		double labMark = input.nextDouble();
		
		if(labMark <0 || labMark > 100)
		{
			System.out.println("Invalid input for the exam marks, Terminating program");
		}
		
		System.out.print("Please enter the percentage given for the exam: ");
		double examPercentage = input.nextDouble();
		
		System.out.print("Please enter the percentage given for the lab submission: ");
		double labPercentage = input.nextDouble();
		
		if(examPercentage + labPercentage !=  100)
		{
			System.out.println("The percentages must add up to 100. Terminating program: ");
		}
		
		if(examPercentage + labPercentage ==  100)
		{
			double finalMarks = (examMark * examPercentage/100) + (labMark * labPercentage/100);
			System.out.println("Final Exam mark is: " + finalMarks);
		}
	}
}