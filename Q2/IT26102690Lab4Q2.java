import java.util.Scanner;
public class IT26102690Lab4Q2{
	public static void main (String[] args){
		
		double ExamMark , LabMark , ExamPercentage , LabPercentage , FinalMark ;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Exam Marks:");
		ExamMark = input.nextDouble();
		
		if (ExamMark < 0 || ExamMark > 100) {
			System.out.println("Exam mark out of range");
			
			return;
		}
		
		System.out.println("Enter Lab Marks:");
		LabMark = input.nextDouble();
		
		if (LabMark < 0 || LabMark > 100) {
			System.out.println("Lab mark out of range");
			
			return;
		}
		
		System.out.println("Enter Exam percentage:");
		ExamPercentage = input.nextDouble();
		
		if (ExamPercentage < 0 || ExamPercentage > 100) {
			System.out.println("Exam Percentage out of range");
			
			return;
		}
		
		System.out.println("Enter Lab Percentage:");
		LabPercentage = input.nextDouble();
		
		if (LabPercentage < 0 || LabPercentage > 100) {
			System.out.println("Lab Percentage out of range");
			
			return;
		}
		
		FinalMark = (ExamMark*ExamPercentage/100) + (LabMark*LabPercentage/100);
		System.out.println(FinalMark);
		
	}
}