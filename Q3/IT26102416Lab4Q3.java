import java.util.Scanner;
public class IT26102416Lab4Q3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		String result = (num > 0) ? "positive"
		               : (num < 0) ? "negative"
					   : "Zero";
		
		System.out.println("The number is : " + result);
		
	}
}	