package LAB2;
import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner (System.in);
		System.out.println("Insert the first number: ");
		
		String marks1 = myObj.nextLine();
		System.out.println("Your enter :" + marks1);
		
		System.out.println("Insert the second number: ");
		
		String marks2 = myObj.nextLine();
		System.out.println("Your enter :" + marks2);
		
		
		System.out.println("The sum of two value  :");
		
		int marksValue = Integer.parseInt(marks2);
		int marksValue2 = Integer.parseInt(marks1);
		
		System.out.println(marksValue+marksValue2);
		
		
		
		
	
	}

}
