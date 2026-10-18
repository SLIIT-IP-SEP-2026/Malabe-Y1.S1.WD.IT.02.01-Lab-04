import java.util.Scanner;
public class IT26100946Lab4Q2{
	public static void main (String[] args){
		double exmark, lbmark, experc, lbperc, fnmark;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter exam marks (out of 100):");
		exmark = sc.nextDouble();
		if (exmark< 0 || exmark>100){
			System.out.println("Invalid input for exam marks Terminating program");
		return;
		}
		System.out.print("Please enter lab submission marks (out of 100): ");
		lbmark = sc.nextDouble();
		if(lbmark<0 || lbmark>100){
			System.out.println("Invalid input for lab sumission Terminating program");
			return;
		}
		System.out.print("Please enter the percentage given for the exam: ");
		experc = sc.nextDouble();
		
		System.out.print("Please enter the percentage given for the lab submission: ");
		lbperc = sc.nextDouble();
		
		if ((experc + lbperc)> 100){
			System.out.println("The percentages must add up to 100. Terminating program.");
			return;
		}
		fnmark = ((exmark * experc/100) + (lbmark * lbperc/100));
		System.out.println("Final mark is :" + fnmark);
		sc.close();
		
		
		
		
		
	}
}
