import java.util.Scanner;
	public class IT26102684Lab4Q3{
		public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		
		int number = input.nextInt();
		
		String result;
		
		result = (number>0)? "The number is positive" :
				 (number<0)? "The number is negative" :
				  "The number is : zero";
				  
		
		System.out.println(result);
		}
	
	}