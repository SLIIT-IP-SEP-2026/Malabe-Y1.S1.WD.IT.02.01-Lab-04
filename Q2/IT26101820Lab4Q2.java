import java.util.Scanner;

public class IT26101820Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        double exam = input.nextDouble();

        System.out.print("Please enter lab submission marks (out of 100): ");
        double lab = input.nextDouble();

        if (exam < 0 || exam > 100 || lab < 0 || lab > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return; 
        }

        System.out.print("Please enter the percentage given for the exam: ");
        double exam_percentage = input.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        double lab_submission = input.nextDouble();

        if (exam_percentage + lab_submission != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        double finalMark = (exam * exam_percentage / 100.0) + (lab * lab_submission / 100.0);

        System.out.println("Final Exam Mark is : " + finalMark);
    }
}