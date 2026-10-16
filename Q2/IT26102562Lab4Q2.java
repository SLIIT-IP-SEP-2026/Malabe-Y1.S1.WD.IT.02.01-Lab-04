import java.util.Scanner;

public class IT26102562Lab4Q2
{
	public static void main( String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Exam Mark: ");
		
		double ExamMark = input.nextDouble();
		if (ExamMark<0 || ExamMark>100)
		{			
			System.out.println("Invalid input for exam marks. Terminating program.");
			return;
		}
		
		System.out.print("Enter the Lab Mark: ");
		
		double LabMark = input.nextDouble();
		if (LabMark<0 || LabMark>100)
		{
			System.out.println("Invalid input for lab marks. Terminating program.");
			return;
		}
		
		System.out.print("Enter the Exam Mark percentage: ");
		double ExamMarkPerc =  input.nextDouble();
		
		System.out.print("Enter the Exam Mark percentage: ");
		double LabMarkPerc =  input.nextDouble();
		
		if ( ExamMarkPerc + LabMarkPerc != 100)
		{
			System.out.println("The percentages must add up to 100. Terminating program.");
			return;
		}
		
		double FinalMark = (ExamMark*ExamMarkPerc/100) + (LabMark*LabMarkPerc/100);
		
		System.out.print("Final Exam Mark is " + FinalMark);
		
	}
}