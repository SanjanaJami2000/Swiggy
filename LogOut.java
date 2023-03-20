package swiggyproject;
import java.util.Scanner;
public class LogOut {
	public static void logout()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter current device");
		String device=scan.nextLine();
		System.out.println();
		System.err.println(""+device+" is found.\n It is ACTIVE.");
		System.out.println("press YES to log out ot NO to not log out?");
		String logout=scan.next();
	}
}
