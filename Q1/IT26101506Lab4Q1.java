import java.util.Scanner;
public class IT26101506Lab4Q1{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int num1;
		
		System.out.print("Enter the Number: ");
		num1 = input.nextInt();
	
		if(num1 > 0)
		{	
			System.out.print("Positive");
		}
		if (num1 < 0)
		{
			System.out.print("Negative");
		}
		else {
			System.out.print("The number is zero");
		}
	}
}