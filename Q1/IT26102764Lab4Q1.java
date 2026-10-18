import java.util.Scanner;

 public class IT26102764Lab4Q1{

    public static void main( String[] args){

        // define the variables
         int num;

        // create the object
         Scanner input = new Scanner(System.in);

        // get user input for the variable 
         System.out.println("Enter a number:");
         num = input.nextInt();

        // check whether the entered number is positive or negative
        if ( num>0){
            System.out.println("The number is:Positive");
        }
        else if (num<0){
            System.out.println("The number is:Negative");
        }
        else{
            System.out.println("The number is zero");
        }


    }
 }