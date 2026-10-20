import java.util.Scanner;
	public class IT26102684Lab4Q2{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter exam marks (out of 100): ");
			double examMarks = input.nextDouble();
			
			if (examMarks < 0 || examMarks > 100){
				System.out.print ("Invalid input for exam marks. Terminating program.");
								
			}
			
			System.out.print("Enter the lab submission marks: ");
			double labSubmissionMarks = input.nextDouble();
			
			if (labSubmissionMarks < 0 || labSubmissionMarks > 100){
				System.out.print("Invalid inout for lab submissionmarks. Terminating program");
														
			}
			
			System.out.print("Enter the percentage given for the exam :");
			double examPercentage = input.nextDouble();
			
			System.out.print("Enter the percentage given for the lab :");
			double labPercentation = input.nextDouble();
			
			
			if (examPercentage + labPercentation != 100);{
			System.out.println("The percentage must add up to 100. Terminating program:");
			
			}
			double finalMarks = (examMarks*examPercentage/100) + (labSubmissionMarks*labPercentation/100);
			
			System.out.println("Final Exam marks is = + examMarks");
		
		}
	
	
	}