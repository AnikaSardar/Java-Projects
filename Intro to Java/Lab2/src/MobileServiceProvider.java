import java.util.Scanner; // Needed for the Scanner class

/**
 * Lab2
 * @author Anika Sardar
 *Date last updated 02/17/2022
 */

public class MobileServiceProvider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double package_A=39.99; 
		double package_B=59.99;
		double package_C=69.99; 
		double extraCharge_A=0.45;
		double extraCharge_B=0.40;
		int minProvided_A= 450; 
		int minProvided_B= 900; 
		int mins=0;
		double bill; 
		double additionalCharge;
		
	      Scanner keyboard = new Scanner(System.in);
		
	      //Ask the user to enter the package name
	      System.out.print("Enter the customer's package (A, B, or C): ");
	      
	      String input = keyboard.nextLine();
	      char packageName = input.charAt(0);
	      
		//print out error message 
		
		if(!(packageName=='A' || packageName=='a' || packageName=='B' || packageName=='b' || packageName=='C' || packageName=='c')){
			System.out.println("Invalid package! Please enter A, B, or C.");
		}


		
		//Ask the user to enter minutes used
		else {
		 System.out.print("Enter the number of minutes used: ");
		 mins=keyboard.nextInt();
	}
	
	//calculate charges based on package name and minutes used
		
		if (packageName=='A' || packageName=='a')
		{
		    if (mins> minProvided_A) 
		    {
		    	   additionalCharge=(mins-minProvided_A)*extraCharge_A;
		    	   bill=package_A+additionalCharge;
		    	System.out.printf("The charges are $%,.2f\n" , bill);	
		    	
		}
		    else 
		    {
		    	System.out.printf("The charges are $%,.2f\n" , package_A);
		    }
		}
		    
		else if (packageName=='B' || packageName=='b')
		    {
			 if (mins> minProvided_B) 
			 {
		    	   additionalCharge=(mins-minProvided_B)*extraCharge_B;
		    	   bill=package_B+additionalCharge;
		    	System.out.printf("The charges are $%,.2f\n" , bill);	
		    	
		    }
		    
		 else 
		 { 
			 System.out.printf("The charges are $%,.2f\n" , package_B);
		 }
		    }
				 
			 else if (packageName=='C' || packageName=='c')
				 
			 {
				 System.out.printf("The charges are $%,.2f\n",package_C);
			 }
				 }
}




		 





