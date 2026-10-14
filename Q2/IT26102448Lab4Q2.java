import java.util.Scanner;
public class IT26102448Lab4Q2
{
	public static void main(String[] args)
	{
		double Exam,Lab,Eprecentage,Lprecentage,Finalmark;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter exam marks(out of 100):");
		Exam = input.nextDouble();
		if (Exam < 0 || Exam >100) 
		{
			System.out.print("Invalid input for exam marks. Terminating program.");
			return;
		}
		
		System.out.print("Please enter lab submission marks (out of 100):");
		Lab = input.nextDouble();
		if (Lab < 0 || Lab > 100)
		{
			System.out.print("Invalid input for Lab submission marks. Terminating program.");
			return;
		}
		System.out.print("Please enter the precentage given for the exam:");
		Eprecentage = input.nextDouble();
		
		System.out.print("Please enter the precentage given for the lab:");
		Lprecentage = input.nextDouble();
		
		if(Eprecentage + Lprecentage !=100)
		{
			System.out.print("The precentage must up to 100. Terminating the program");
			return;
		}
		Finalmark = (Exam * Eprecentage/100)+(Lab * Lprecentage/100);
		
		System.out.print("Final exam mark is :" + Finalmark);
	}
}
		