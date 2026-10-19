import java.util.Scanner;
public class IT26102598Lab4Q3{
	public static void main (String [] args){
		
		Scanner input = new Scanner ( System.in);
		
		int num;
		String result;
		
		System.out.println("Enter a number:");
		num = input.nextInt();
		
		result = (num > 0 ) ? " The number is Positive " : 
		         (num < 0 ) ? " The number is Negative " :
				 "The number is zero";
				 
				 System.out.println(result);
	}
}	