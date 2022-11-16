// Chapter 6 practice exercise

import java.util.Scanner;

public class AssignVolunteer
{
	public static void main(String[] args)
	{
		// variables and constants
		int donationType;
		String message = "";
		String volunteer = "";
		final int CLOTHING_CODE = 1;
		final int FURNITURE_CODE = 2;
		final int ELECTRONICS_CODE = 3;
		final int OTHER_CODE = 4;

		final String CLOTHING_PRICER = "Regina";
		final String FURNITURE_PRICER = "Walter";
		final String ELECTRONICS_PRICER = "Lydia";
		final String OTHER_PRICER = "Marco";
		Scanner input = new Scanner(System.in);

		//input phase
		System.out.println("What type of donation is this?");
		System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + FURNITURE_CODE + " for furniture, " + ELECTRONICS_CODE + " for electronics, " + OTHER_CODE + " for anything else >>");
		donationType = input.nextInt();

		// processing phase
		while(donationType < CLOTHING_CODE || donationType > OTHER_CODE)
		{
			System.out.println("You entered " + donationType + " which is NOT a valid donation type!");
		} // end of while loop	

		switch(donationType)
		{
			case(CLOTHING_CODE):
			{
				volunteer = CLOTHING_PRICER;
				message = "a clothing donation";
				break;
			}	
		case(FURNITURE_CODE):
			{
				volunteer = FURNITURE_PRICER;
				message = "a furniture donation";
				break;
			}
			case(ELECTRONICS_CODE):
			{
				volunteer = ELECTRONICS_PRICER;
				message = "an electronics donation";
				break;
			}
			case(OTHER_CODE):
			{
				volunteer = OTHER_PRICER;
				message = "another donation type";
				break;
			}		
			default:
			{
				volunteer = "invalid";
				message = "invalid donation type!";
			}	
		} // end of switch

		// output phase
		System.out.println("You entered " + donationType);
		System.out.println("This is " + message);
		System.out.println("The volunteer who will price this item is " + volunteer);
		System.out.println("Thank you for donating!");
	} // end of main() 
}