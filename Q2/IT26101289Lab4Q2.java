import java.util.Scanner;

public class IT26101289Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("please enter exam marks (out of 100): ");
        int exam = input.nextInt();

        if (exam < 0 || exam > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        System.out.print("Please enter lab submission marks (out of 100): ");
        int lab = input.nextInt();

        if (lab < 0 || lab > 100) {
            System.out.println("Invalid input for lab marks. Terminating program.");
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        double examMarks = input.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        double labMarks = input.nextDouble();

        if (examMarks < 0 || labMarks < 0 ||
            examMarks + labMarks != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        double finalMark =(exam * examMarks / 100)+(lab * labMarks / 100);

        System.out.println("Final Exam Mark is: " + finalMark);
    }
}