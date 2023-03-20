package swiggyproject;
import java.util.Scanner;
public class EditAddress {
	public static void editAdd()
	{
		while(true)
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("plot no");
		String plono=scan.next();
		System.out.println("street no");
		String stno=scan.next();
		System.out.println("enter pincode");
		int pin=scan.nextInt();
		System.out.println("enter area");
		scan.nextLine();
		String area=scan.nextLine();
		System.out.println("enter area1");
		String area1=scan.next();
		System.out.println("enter city");
		String city=scan.next();
		System.out.println("enter state");
		String state=scan.next();
		System.out.println("enter country");
		String country=scan.next();
		System.out.println();
		System.out.println("enter phone number");
		long pno=scan.nextLong();
		System.out.println();
		System.out.println(""+plono+", "+stno+", "+area+", "+area1+", "+city+", "+pin+", "+state+", "+country+"");
		System.out.println("press 1 to edit your address or press 2 to exit");
		if(scan.nextInt()==1)
		{
			continue;
		}
		else
		{
			break;
		}
	}
	}
}
