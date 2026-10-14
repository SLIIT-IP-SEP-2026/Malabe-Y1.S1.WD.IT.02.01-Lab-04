import java.util.Scanner;
public class IT26102775Lab4Q3{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
   //Getting the input from the user
  System.out.print("Enter a number :");
  int digit = input.nextInt();
  
  String message;
  message = (digit > 0) ? "Positive" : 
            (digit < 0) ? "Negative" : 
			"zero";
  System.out.println(message);
 }
}