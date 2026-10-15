import java.util.Scanner;
public class IT26102740Lab4Q1{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if(num > 0){
            System.out.print("It is a positive number");
        }

        else if(num < 0){
            System.out.print("It is a negative number");
        }
        else{
            System.out.print("Zero");
        }
    }
}