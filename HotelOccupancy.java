import java.util.Scanner;
/**
   Mohammed Raza
   CSC162-01
   Lab 1 Program 2
*/

public class HotelOccupancy
{
   public static void main(String[] args)
   {
	  int LCV;
      int floors;
      int rooms;
      int occupied;
      int vacant;
      double occupancyrate;


      Scanner keyboard = new Scanner(System.in);

      System.out.println("Enter number of floors in the hotel: ");
      floors = keyboard.nextInt();

      for(LCV=1; LCV <= floors; LCV++)
      {

      	   System.out.println("Enter number of rooms on the floor: ");
      	   rooms = keyboard.nextInt();

      	   System.out.println("Enter number of rooms occupied: ");
      	   occupied = keyboard.nextInt();

      }

      vacant = (rooms - occupied);

      occupancyrate = (occupied / rooms);

      System.out.println("Number of rooms: " + rooms);
      System.out.println("Number of rooms occupied: " + occupied);
      System.out.println("Number of rooms vacant: " + vacant);
      System.out.println("Occupancy rate: " + occupancyrate);


    }
 }

