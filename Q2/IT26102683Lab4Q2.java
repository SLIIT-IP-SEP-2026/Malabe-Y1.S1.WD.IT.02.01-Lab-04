import java.util.Scanner;
public class IT26102683Lab4Q2{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter exam marks:");
		int marks = input.nextInt();
		
		if(marks>=0 && marks<=100){
			System.out.print("Please enter the lab submission marks:");
		    int lab_marks = input.nextInt();
			
			if(lab_marks>=0 && lab_marks<=100){
				System.out.print("Please enter the percentage given for the exam:");
				int percentage1 = input.nextInt();
				
				System.out.print("Please enter the percentage given for the lab submission:");
				int percentage2 = input.nextInt();
				
				int totalpercentage =(percentage1 + percentage2);
				
				if (totalpercentage == 100){
					double num_per1 = (marks*percentage1/100);
					double num_per2 = (lab_marks*percentage2/100);
					double total = num_per1+num_per2;
					
					System.out.print("Final exam mark is: "+ total);
				}
					
				else{
					System.out.print("The percentages must add up to 100. Terminating program");
				}
			}
			else{
				System.out.print("Invalid input for lab marks.Terminating program");
			}
		}
		else{
			System.out.print("Invalid input for exam marks.Terminating program.");
		}
				
		
	}
}