import java.util.Scanner;
public class IT26102778Lab4Q3{
    public static void main(String[]args){
		String result;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number= input.nextInt();

        result= (number>0) ?"The number is positive":
                (number<0) ?"The number is Negative":
		"The Number is: Zero";
		
		System.out.println(result);
    }
}
