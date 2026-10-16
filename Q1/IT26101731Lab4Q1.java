import java.util.Scanner;
public class IT26101731Lab4Q1{
    public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	
	    System.out.print("Enter the number: ");
		int Number=input.nextInt();
		
		if(Number>0){
		    System.out.print("The number is: positive");
		}	
		else if(Number<0){
			    System.out.print("The number is: negative");
				}
		
		else{
			System.out.print("The number is zero");
			}
	}
}