import java.util. Scanner;
public class IT26101731Lab4Q2{
    public static void main (String[] args){
        double examMark,labMark,examMarkPercentage,labMarkPercentage,finalmark;
	
        Scanner input=new Scanner(System. in);
	
        System.out.print("Please enter exam mark (out of 100):");
        examMark=input.nextDouble();
	
        if (examMark>100 || examMark<0){
        System.out.print("Invalid input for exam marks. Terminating program.");
	    return;}
	
        System.out.print("Please enter lab mark (out of 100):");
	    labMark=input.nextDouble();
	
        if (labMark>100 || labMark<0){
        System.out.print("Invalid input for lab marks. Terminating program.");
		return;}
		
        System.out.print("please enter the percentage given for the exam:");
		examMarkPercentage=input.nextDouble();
        System.out.print("please enter the percentage given for the lab submission:");
        labMarkPercentage=input .nextDouble();
		
        if((examMarkPercentage+labMarkPercentage) !=100){
        System.out.print("The percentage must add up to 100. Terminate program.");
		return;}
		
        finalmark=((examMark*examMarkPercentage/100) + (labMark*labMarkPercentage/100));
        System.out.print("final exam mark is: "+finalmark);
	}
}
		