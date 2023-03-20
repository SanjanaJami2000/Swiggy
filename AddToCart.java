package swiggyproject;
import java.util.Scanner;
public class AddToCart {
	public static void addToCart()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your order again for confirmation");
		String confirm=scan.nextLine();
		EditAddress.editAdd();
		Genie.genie();
	}
		
	}


