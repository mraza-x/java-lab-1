import javax.swing.JOptionPane;

/**
   Mohammed Raza
   CSC162-01
   Lab 1 Program 3
*/

public class PaintJobEstimator
{
   public static void main(String[] args)
   {

	int LCV;
   	int rooms;
   	double sqft;
   	double pricepergallon;
   	double gallons;
   	double painttotal;
   	double laborhours;
   	double laborcharges = laborhours * 18;
   	double totalcost;

	gallons = sqft / 115;

   	painttotal = (pricepergallon * gallons);
   	totalcost = (laborcharges + painttotal);

   	input = JOptionPane.showInputDialog("Enter number of rooms painted: ")
		        rooms = Integer.parseInt(input);

   	for (LCV = 1; LCV <= rooms; LCV++)
   	  {
		  input = JOptionPane.showInputDialog("Enter square feet for room number : " + LCV)
		  sqft = Double.parseDouble(input);
	  }

	input = JOptionPane.showInputDialog("Enter price of paint per gallon: ")
	pricepergallon = Double.parseDouble(input);

	input = JOptionPane.showInputDialog("Enter hours of labor required: ")
	laborhours = Double.parseDouble(input);

	JOptionPane.showMessageDialog(null, "The total estimated cost is $" + dollar.format(totalcost));

	}



}















    }
 }