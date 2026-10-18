import java.util.Scanner;

 public class IT26102764Lab4Q3{

    public static void main( String[] args){

         // define the variables
         int num;
         String result;

        // create the object
         Scanner input = new Scanner(System.in);

        // get user input for the variable 
         System.out.println("Enter a number:");
         num = input.nextInt();

        //condition
         result= (num>0)?" The number is Positive":
                 (num<0)?"The number is Negative":
                 "The number is: zero";
        
        System.out.println(result);
    }
 }