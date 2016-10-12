import java.util.Scanner;

/**
   Mohammed Raza
   CSC162-01
   Lab 1 Program 4
*/

public class DriverExam
{
   public static void main(String[] args)
   {

	Scanner keyboard = new Scanner(System.in);

	
	String[] correctanswers = { "B", "D", "A", "A", "C", 
				    "A", "B", "A", "C", "D",
				    "B", "C", "D", "A", "D",
				    "C", "C", "B", "D", "A"  };
				    
	int[] questionnumbers = { 1, 2, 3, 4, 5,
				  6, 7, 8, 9, 10,
				  11, 12, 13, 14, 15,
				  16, 17, 18, 19, 20  };

	System.out.println("Enter student answers: ");
				   
				    
	for (int index = 0; index < correctanswers.length; index++)
	{
		System.out.println("Question " + questionnumbers[index] + ":");
		
		
				
				
	
	
