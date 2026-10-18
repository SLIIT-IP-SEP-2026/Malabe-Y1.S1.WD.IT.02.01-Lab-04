import java.util.Scanner;
public class IT26102778Lab4Q2{
    public static void main(String []args){
		double E_Marks, L_Marks, F_Marks;
        double E_Percentage, L_Percentage;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Please enter exam marks (out of 100): ");
	    E_Marks= input.nextDouble();
	if (E_Marks < 0 || E_Marks > 100) {
    System.out.println("Invalid input for exam marks. Terminating program.");
    return;
}
	
	System.out.print("Please enter lab submission marks (out of 100): ");
	    L_Marks= input.nextDouble();
	if(L_Marks < 0 || L_Marks > 100) {
            System.out.println("Invalid input for lab marks. Terminating program.");
            return;
        }
	
	System.out.print("Please enter the percentage given for the exam: ");
	    E_Percentage= input.nextDouble();
		
		System.out.print("Please enter the percentage given for lab submission: ");
	    L_Percentage= input.nextDouble();
		
	if(E_Percentage+L_Percentage!=100){
	System.out.println("The percentages must add up to 100. Terminating program.");
	return;}
	
	F_Marks = (E_Marks * E_Percentage / 100)+ (L_Marks * L_Percentage / 100);
	System.out.print("The Final mark is: "+F_Marks);
	
	
		}
    }