import java.util.Scanner;
public class IT26102775Lab4Q2{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
 //Getting the user input for exam marks
  System.out.println("Please enter exam marks (out of 100) :");
  int exam_marks = input.nextInt();
  if (exam_marks < 0 || exam_marks > 100){
	  System.out.println("Invalid input for exam marks. Terminating program.");
      return;}
  
//Getting the user input for lab submission marks
  System.out.println("Please enter lab submission marks (out of 100) :");
  int lab_marks = input.nextInt();
  if (lab_marks < 0 || lab_marks > 100){
	  System.out.println("Invalid input for lab submission marks. Terminating program.");
      return;}
 
 //Getting the user input for exam percentage
  System.out.println("Please enter the percentage given for the exam :");
  int exam_per = input.nextInt();
  System.out.println("Please enter the percentage given for the lab submission :");
  int lab_per = input.nextInt();
  
  //Getting the user input for lab submission percentage
   if (exam_per + lab_per != 100){
	  System.out.println("The percentages must add up to 100. Terminating program.");
      return;
  } else {
	  double final_exam = (exam_marks * exam_per/100) + (lab_marks * lab_per/100);
	  System.out.println("Final exam mark is :" + final_exam);
  }
 }
}
		  
  