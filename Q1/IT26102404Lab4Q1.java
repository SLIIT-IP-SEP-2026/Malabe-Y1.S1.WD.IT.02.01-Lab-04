import java.util.Scanner;

public class IT26102404Lab4Q1 {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
	 
	System.out.print ("Enter a number: ");
	int num = input.nextInt ();
	
	if (num > 0) {
		 System.out.println("Positive Number");
    }else if (num < 0) {
		 System.out.println("Negative Number");
    }else {
		 System.out.println("Number is Zero");
    }
         input.close();
    }
 }
	 