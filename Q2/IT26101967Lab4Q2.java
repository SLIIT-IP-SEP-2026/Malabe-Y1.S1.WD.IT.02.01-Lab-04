import java.util.Scanner;
public class IT26101967Lab4Q2{
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
System.out.println("enter lab submission marks:");
double lab_marks=input.nextDouble();
System.out.println("enter exam marks");
double exam_marks=input.nextDouble();
System.out.println("enter lab percentage:");
double lab_percentage=input.nextDouble();
System.out.println("enter exam percentage:");
double exam_percentage=input.nextDouble();

if(lab_marks<0 || exam_marks<0||exam_marks>100||lab_marks>100||
exam_percentage+lab_percentage!=100

)
{
	System.out.println("invalid input:");
	
	
	
	
}

else{
	double final_marks=(lab_marks*lab_percentage/100.0)+(exam_marks*exam_percentage/100.0);
	System.out.println("final marks"+final_marks);
	
	
	
	
}
	
		
		
		
		
		
		
		
		
		
		
		
	}	
	
	
	
	
	
	
}