import java.util.Scanner;
public class IT26101731Lab4Q3{
	public static void main(String[] args){
	double number;
    
    Scanner input=new Scanner(System.in);
    System.out.print("Enter a number: ");
	number=input.nextDouble();
	
	String result=(number>0)? "Positive" :((number<0)? "Negative" : "zero");
	System.out.print("The number is: "+result);
	}
}