import java.util.Scanner;
public class IT26102595Lab4Q2{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter exam marks (0-100): ");
       double examMarks = input.nextDouble();

       if (examMarks < 0 || examMarks > 100) {
           System.out.println("Invalid exam marks. Marks must be between 0 and 100.");
           input.close();
           return;
       }

       System.out.print("Enter lab submission marks (0-100): ");
       double labMarks = input.nextDouble();

       if (labMarks < 0 || labMarks > 100) {
           System.out.println("Invalid lab marks. Marks must be between 0 and 100.");
           input.close();
           return;
       }

       System.out.print("Enter exam percentage: ");
       double examPercentage = input.nextDouble();

       System.out.print("Enter lab percentage: ");
       double labPercentage = input.nextDouble();

       if (examPercentage < 0 || labPercentage < 0 ||
           examPercentage + labPercentage != 100) {
           System.out.println("Invalid percentages. They must add up to 100.");
           input.close();
           return;
       }

       double finalMark = (examMarks * examPercentage / 100)
                        + (labMarks * labPercentage / 100);

       System.out.println("Final mark: " + finalMark);

       input.close();
   }
}
  