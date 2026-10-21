
import java.util.Scanner;

public class IT26102599Lab4Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double exam, lab, examPercentage, labPercentage;
        double finalMark;

        System.out.print("Please enter exam marks (out of 100): ");
        exam = input.nextDouble();

        if (exam < 0 || exam > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        System.out.print("Please enter lab submission marks (out of 100): ");
        lab = input.nextDouble();

        if (lab < 0 || lab > 100) {
            System.out.println("Invalid input for lab marks. Terminating program.");
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        examPercentage = input.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        labPercentage = input.nextDouble();

        if (examPercentage < 0 || examPercentage > 100 ||
            labPercentage < 0 || labPercentage > 100 ||
            examPercentage + labPercentage != 100) {

            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        finalMark = (exam * examPercentage / 100)
                  + (lab * labPercentage / 100);

        System.out.println("Final Exam Mark is : " + finalMark);

        
    }
}
