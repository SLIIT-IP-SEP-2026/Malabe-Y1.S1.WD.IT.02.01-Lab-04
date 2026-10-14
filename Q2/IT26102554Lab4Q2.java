import java.util.Scanner;

public class IT26102554Lab4Q2 { 
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter exam marks(0-100): ");
        double examMarks = input.nextDouble();

        if(examMarks<0||examMarks>100){
            System.out.println("invalid Marks");
            return;
        }
        
		System.out.print("Enter lab submission:");
        double labMarks=input.nextDouble();

        if(labMarks<0||labMarks>100){
            System.out.print("Invalid lab Marks");

            return;
        }
		
        System.out.print("Enter exam percentage:");
        double examPercentage=input.nextDouble();

        System.out.print("Enter lab percentage:");
        double labPercentage=input.nextDouble();

        if(examPercentage+labPercentage != 100){
            System.out.println("Invalid percentages");

            return;
        }
		
        double finalMark=(examMarks*examPercentage/100)+(labMarks*labPercentage/100);
        System.out.println("Final marks"+finalMark);
    }
}