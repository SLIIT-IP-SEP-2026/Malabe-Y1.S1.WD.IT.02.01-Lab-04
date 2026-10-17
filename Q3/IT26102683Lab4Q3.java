import java.util.Scanner;
public class IT26102683Lab4Q3{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		System.out.print("Enter a number : ");
		int value = input.nextInt();
		
		String message = (value>0)? "The number is: Positive":
		                 (value<0)? "The number is: Negative":
						 ("The number is ZERO");
						 
		System.out.print(message);
	}
}