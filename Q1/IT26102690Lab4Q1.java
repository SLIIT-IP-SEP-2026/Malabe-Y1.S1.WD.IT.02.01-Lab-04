import java.util.Scanner;
public class IT26102690Lab4Q1 {
	public static void main(String[] args){
		double mynum;
		Scanner input = new Scanner(System.in);
		System.out.println("enter num");
        mynum = input.nextDouble();
		
		if (mynum > 0){
			System.out.println("Positive");
		}
		
		if (mynum < 0){
			System.out.println("Negative");
			
		}
		
		if (mynum == 0 ){
			System.out.println("Zero");
		}
		
	}
}