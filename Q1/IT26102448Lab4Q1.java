import java.util.Scanner;
public class IT26102448Lab4Q1
{
	public static void main (String[] args)
	{
	 int no1;
     Scanner input= new Scanner(System.in);
	 
     System.out.print("Enter The Number:");
     no1=input.nextInt();
     
	 if (no1 >= 1)
	 {
		 System.out.print("The number is:Positive");
		 
	 }
	 else if(no1==0)
	 {
		 System.out.print("The number is:Zero");
		 	 }
	 else
	 {
		 System.out.print("The number is:negative");
	 }
	}
}

