import java.util.Scanner;
 
 public class IT26102764Lab4Q2{
    
    public static void main(String[] args){

        // defining the variables
         double exam_marks, lab_marks, pexam_marks, plab_marks, final_marks;

        // create the object
         Scanner input = new Scanner(System.in);

        // get user input for exam marks
         System.out.println("Please enter exam marks(out of 100)");
         exam_marks= input.nextDouble();

        // check the validity of the exam marks
         if(exam_marks<=0 || exam_marks>=100){
            System.out.println("Invalid input for exam marks. Terminating program");
            return;
         }

        // get user input for lab marks
         System.out.println("Please enter lab marks(out of 100)");
         lab_marks = input.nextDouble();

        // check the validity of the lab marks
         if (lab_marks<=0 || lab_marks>=100){
             System.out.println("Invalid input for lab marks.Terminating program.");
             return;
         }

        // get user input for exam
         System.out.println("Please enter the percentage given for the exam:");
         pexam_marks = input.nextDouble();

        // get user input for lab submission
         System.out.println("Please enter the percentage given for lab submission:");
         plab_marks = input.nextDouble();

        // calculating the final marks
         if (( pexam_marks <= 50) && ( plab_marks<=50)){
            final_marks= pexam_marks+ plab_marks;
            System.out.println("Final exam mark is:"+ final_marks);
         }
         else{
            System.out.println("The percentage must be add up to 100.Terminating program.");
         }
    }
 }

        
 