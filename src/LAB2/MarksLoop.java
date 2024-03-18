package LAB2;
import java.util.Scanner;
public class MarksLoop {
	
	public static void main(String[]args)
	{
		
		float sum=0;
		Scanner myChoice = new Scanner (System.in);
		System.out.println("Insert the first number: ");
		
		int choice = myChoice.nextInt();
		System.out.println("Your enter :" + choice);
		
		for (int i=0;i<choice;i++)
		{
			System.out.println("Please enter the marks no"+(i+1) );
			Scanner myMarks = new Scanner (System.in);
			
			String marks = myMarks.nextLine();
			
			System.out.println(marks);
			float SumMarks = Float.parseFloat(marks);
			
			System.out.println("Total marks is :"+sum);
			sum+=SumMarks;
	
		}
	}
}
