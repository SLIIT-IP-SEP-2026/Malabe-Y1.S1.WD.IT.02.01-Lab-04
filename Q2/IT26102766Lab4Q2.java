import java.util.Scanner;
        public class IT26102766Lab4Q2{
		public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		double examMarks, labMarks, examPercentage, labPercentage, finalMark;
		
		System.out.print("Please enter the exam marks : ");
		examMarks = input.nextDouble();
		if (examMarks < 0 || examMarks > 100){
		    System.out.println("Invalid input for exam marks. Terminating program.");
		    return;        // Exit the program
		}
		
		System.out.print("Please enter the lab marks : ");
		labMarks = input.nextDouble();
		if (labMarks < 0 || labMarks > 100){
		    System.out.println("Invalid input for lab marks. Terminating program.");
		    return;       //Exit the program
		}
			 
		System.out.print("Please enter the percentage given for the exam marks : ");
        examPercentage = input.nextDouble();

        System.out.print("Please enter the percentage given for the lab marks : ");
        labPercentage = input.nextDouble();

        if (examPercentage + labPercentage != 100){
			System.out.println("The percentage must add up to 100. Terminating program.");
			return;       //Exit the program	
		}		
		
		finalMark = (examMarks * examPercentage/100) + (labMarks * labPercentage/100);
		
		System.out.println();
        System.out.println("Final Exam Mark is : "+ finalMark);    		
		}
	}