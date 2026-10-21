import java.util.Scanner;

public class IT26101664Lab4Q3{
	public static void main(String[] args){
		
		int number;
		String result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number;");
			 number = input.nextInt();
			
			result = (number > 0 ) ? "the number is :positive":
			         (number < 0 ) ? "the number is :negative":
			         ("the number is : zero");
					 
				System.out.println (result);
	}
	
}
