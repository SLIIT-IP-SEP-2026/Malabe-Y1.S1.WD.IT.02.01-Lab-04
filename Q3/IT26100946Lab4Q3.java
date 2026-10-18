import java.util.Scanner;
public class IT26100946Lab4Q3{
	public static void main(String[] args){
		int no;
		String awns;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		no = sc.nextInt();
		awns = (no>0) ?"Positive" :(no<0)?"Negative" : "Zero";
		System.out.println("The number is : " + awns);
		sc.close();
		
		
		
	}

}