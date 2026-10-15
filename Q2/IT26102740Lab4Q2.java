import java.util.Scanner;
public class IT26102740Lab4Q2{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter  the marks of the final exam:");
        double FinalMark = input.nextDouble();

        if((FinalMark < 0) && ( FinalMark > 100)){
            System.out.print("The final test marks should be out of 100(0-100)");
            return;
        }

         System.out.print("Enter  the marks of the lab submissions:");
         double LabMarks = input.nextDouble();

         if((FinalMark < 0) && (FinalMark > 100)){
            System.out.print("The lab submission marks should be out of 100(0-100)");
            return;     
        }

        System.out.print("Enter the percentage taken from final test marks:");
        double FinalPercentage = input.nextDouble();

        System.out.print("Enter the percentage taken from lab subission marks:");
        double LabPercentage = input.nextDouble();

        if ( FinalPercentage + LabPercentage != 100){
            System.out.print("The percentages must add up to 100. Terminate the programme");
            return;
        }
        double TotalMarks = (  FinalMark * FinalPercentage/100 )+( FinalMark * FinalPercentage/100 );

        System.out.print("The total marks are :" + TotalMarks);
}
}