
import java.util.Scanner;

public class IT26520069Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter exam marks: ");
        double exam = input.nextDouble();

        if (exam < 0 || exam > 100) {
            System.out.println("Invalid exam marks");
            input.close();
            return;
        }

        System.out.print("Enter lab submission marks: ");
        double lab = input.nextDouble();

        if (lab < 0 || lab > 100) {
            System.out.println("Invalid lab marks");
            input.close();
            return;
        }

        System.out.print("Enter exam percentage: ");
        double examPercentage = input.nextDouble();

        System.out.print("Enter lab percentage: ");
        double labPercentage = input.nextDouble();

        if (examPercentage < 0 || labPercentage < 0 ||
            examPercentage > 100 || labPercentage > 100 ||
            examPercentage + labPercentage != 100) {
            System.out.println("Invalid percentages");
            input.close();
            return;
        }

        double finalMark = (exam * examPercentage / 100)
                         + (lab * labPercentage / 100);

        System.out.println("Final mark: " + finalMark);

        input.close();
    }
}
