import java.util.Scanner;

public class IT26101727Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double examMarks, labMarks;
        double examPercentage, labPercentage;
        double finalMarks;

        
        System.out.print("Enter exam marks (0-100): ");
        examMarks = input.nextDouble();

        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid exam marks!");
            input.close();
            return;
        }

        System.out.print("Enter lab submission marks (0-100): ");
        labMarks = input.nextDouble();

        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid lab marks!");
            input.close();
            return;
        }

        System.out.print("Enter exam percentage: ");
        examPercentage = input.nextDouble();

        System.out.print("Enter lab percentage: ");
        labPercentage = input.nextDouble();

      if (examPercentage < 0 || labPercentage < 0 ||
            examPercentage > 100 || labPercentage > 100 ||
            examPercentage + labPercentage != 100) {
            System.out.println("Invalid percentages! They must add up to 100.");
            input.close();
            return;
        }

      
        finalMarks = (examMarks * examPercentage / 100)
                   + (labMarks * labPercentage / 100);

        System.out.printf("Final marks: %.2f%n", finalMarks);

        input.close();
    }
}
