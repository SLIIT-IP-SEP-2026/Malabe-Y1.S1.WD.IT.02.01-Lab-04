import java.util.Scanner;
public class IT26102690Lab4Q3 {
	public static void main(String[] args){
		double mynum;
		String result;
		Scanner input = new Scanner(System.in);
		System.out.println("enter num");
        mynum = input.nextDouble();
		
		result = (mynum > 0) ? "Positive":
	             (mynum < 0) ? "Negative":
			     "Zero";
	    System.out.println(result);
		
	}
}