import java.util.Scanner;
/**
   Mohammed Raza
   CSC162-01
   Lab 1 Program 1
*/

public class InternetServiceProvider
{
   public static void main(String[] args)
   {

      char package;
      int hours;
      double output1;
      double output2;
      double total;

      Scanner keyboard = new Scanner(System.in);

      System.out.println("Enter the package letter (A,B,C): ")
      package = keyboard.nextLine();

      switch(package)
      {

         case 'a':
         case 'A':
         	output1 = (hours/10)*9.95;
         	output2 = (hours%10)*2.00;
         	total = output1 + output2;
            System.out.println("Total Price: $" + total);
            break;

         case 'b':
         case 'B':
            output1 = (hours/20)*13.95;
			output2 = (hours%20)*1.00;
			total = output1 + output2;
            System.out.println("Total Price: $" + total);
            break;

         case 'c':
         case 'C':
			total = 19.95;
            System.out.println("Total Price: $" + total);
            break;

         default:
            System.out.println("Invalid");
      }
   }
}
