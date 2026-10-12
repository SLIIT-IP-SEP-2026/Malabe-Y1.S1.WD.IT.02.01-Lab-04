import java.util.Scanner;
public class IT26102717Lab4Q2{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter exam marks :");
		int marks = input.nextInt();
		
		if(marks<=100 && marks>=0){
			System.out.print("Please enter the lab submission marks :");
			int lab = input.nextInt();
			
			if(lab<=100 && lab>=0){
				System.out.print("Please enter the percentage given for the exam :");
				int percentage1 = input.nextInt();
				
				System.out.print("Please enter the percentage given for the lab submission :");
				int percentage2 = input.nextInt();
				
				int Totalpercentage = (percentage1 + percentage2);
				
				if(Totalpercentage ==100){
					
					double n1 = (marks * percentage1)/100 ;
					double n2 = (lab * percentage2)/100;
					
					double total = (n1 + n2);
					
					System.out.print("Final marks is : " + total);
				}
				else{
					System.out.print("The percentage must add up to 100.Terminating program.");
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