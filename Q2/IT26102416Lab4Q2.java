import java.util.Scanner;

public class IT26102416Lab4Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	     
		
		System.out.print("Enter the exam marks (out of 100) : ");
		double examMark = input.nextDouble();
		
		if (examMark < 0 || examMark > 100) {
			System.out.println(" Invalid input for exam marks. Terminating program.");
			return;
		}

		System.out.print(" please enter lab submission marks ( out of 100): ");
		double labMarks = input.nextDouble();
		
		if (labMarks < 0 || labMarks > 100) {
			System.out.println("Invalid input for lab submission marks.Terminating program.");
			return;
		}

		System.out.print("please enter the percentage given for the exam: ");
		double examPercentage = input.nextDouble();
		
		System.out.print("please enter the percentage given for the lab submission: ");
		double labPercentage = input.nextDouble();
		
		if (examPercentage + labPercentage != 100) {
				
			System.out.println(" The percentage must add up to 100.	Terminating program.");
			return;
			}
		
		double finalMark = ( (examMark * examPercentage) / 100) + ( (labMarks * labPercentage) / 100);
						 
		System.out.println(" Final Exam Mark is : " + finalMark);

	}
}	