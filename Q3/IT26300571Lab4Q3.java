import java.util.Scanner;
public class IT26300571Lab4Q3 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int number;
		String result;
		
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		result = (num > 0) ? "The number is : positive":
		         (num < 0) ? " The number is : Negative":
		          " The number is Zero ";
				  
		System.out.println(result);
	}
}

		
		