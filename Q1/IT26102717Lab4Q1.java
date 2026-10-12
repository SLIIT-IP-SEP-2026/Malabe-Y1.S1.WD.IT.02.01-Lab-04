import java.util.Scanner;
public class IT26102717Lab4Q1{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int no = input.nextInt();
		
		System.out.print("The number is ");
		if(no>0){
			System.out.print("Positive");
		}
		if(no<0){
			System.out.print("Negative");
		}
		if(no==0){
			System.out.print("Zero");
		}
	}
}