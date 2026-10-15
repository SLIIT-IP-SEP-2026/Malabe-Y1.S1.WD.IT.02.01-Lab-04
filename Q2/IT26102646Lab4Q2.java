import java.util.Scanner;

public class IT26102646Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = input.nextDouble();

        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = input.nextDouble();

        if (examMarks < 0 || examMarks > 100 ||
            labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid marks!");
        } else {
            System.out.print("Please enter the percentage given for the exam: ");
            double examPercentage = input.nextDouble();

            System.out.print("Please enter the percentage given for the lab submission: ");
            double labPercentage = input.nextDouble();

            if (examPercentage < 0 || labPercentage < 0 ||
                examPercentage > 100 || labPercentage > 100 ||
                examPercentage + labPercentage != 100) {
                System.out.println("Invalid percentages!");
            } else {
                double finalMark =
                    (examMarks * examPercentage / 100) +
                    (labMarks * labPercentage / 100);

                System.out.println("Final Exam Mark is : " + finalMark);
            }
        }

        input.close();
    }
}