import java.util.Scanner;
public class IT26102775Lab4Q1{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
  //Getting the input from the user
  System.out.println("Enter a number :");
  int digit = input.nextInt();
  
  if (digit > 0) {
	  System.out.println("Positive");
  }else if (digit < 0) {
	  System.out.println("Negative");
  } else 
	  System.out.println("Zero");
 }
}

  