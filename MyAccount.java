// Food ordering system- "Swiggy"
package swiggyproject;
import java.util.Scanner;
public class MyAccount {
	public static void main(String[] args)
	{
		account();
	}
	public static void account()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("***Welcome to Swiggy***");
		System.out.println("***please, enter your phone number +91 to continue***");
		long pno=scan.nextLong();
		System.out.println("***Welcome Sanjana***");
		System.out.println("***please enter your mail id to get your order updates***");
		String id=scan.next();
		System.out.println();
		Swiggy.swiggy();
		
	}
}
