import java.util.Scanner;

public class IT26101664Lab4Q1{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number;");
		int number = input.nextInt();
		
		if (number > 0) {
		                System.out.println("the number is :positive");}
		else if (number < 0){
		                     System.out.println("the number is :negative");}
        else{
		System.out.println ("the number is zero");
		}
input.close();
	}
}	
		