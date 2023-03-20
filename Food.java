package swiggyproject;
import java.util.Scanner;
public class Food {
	public static void food() 
	{
		Scanner scan=new Scanner(System.in);
		System.err.println("Sanjana, what's on your mind?");
		System.out.println("1)Dosa\n 2)Poori\n 3)Idli\n 4)Paratha\n 5)Vada\n 6)Uttapam");
		String breakfast=scan.next();
		switch(breakfast)
		{
		case "Dosa":
			System.out.println("1)Sri Devi hotel\n 2)Lucky tiffins\n 3)Veg Delight");
			String dosa=scan.next();
			switch(dosa)
			{
			case "Sri Devi hotel":
				System.out.println("4.2(100+ ratings),150 INR for two");
				System.out.println("outlet-33 mins, sector 6-delievery to rushikonda");
				System.out.println("Far(9.5kms)");
				break;
			case "Lucky tiffins":
				System.out.println("4.4(100+ratings),150 INR for two");
				System.out.println("outlet-31 mins,sector 9-delievery to rushikonda");
				System.out.println("far(8.8kms)");
				break;
			case "Veg Delight":
				System.out.println("3.9(50+ ratings),200 INR for two");
				System.out.println("outlet-41 mins,madhurawada-delievery to rushikonda");
				System.out.println("Far(7kms)");
				break;
			}
			break;
		case "Poori":
			System.out.println("1)Home food\n 2)mohammeds cafe\n 3)Laddo gopal");
			String poori=scan.next();
			switch(poori)
			{
			case "Home food":
				System.out.println("3.9(1k+ ratings),200 INR for two");
				System.out.println("outlet-33 mins,mvp colony-delivery to rushikonda");
				System.out.println("Far(9.6kms)");
				break;
			case "mohammeds cafe":
				System.out.println("4.2(100+ ratings),200 INR for two");
				System.out.println("outlet-30 mins,madhurawada-delievery to rushikonda");
				System.out.println("Far(5kms)");
				break;
			case "Laddo gopal":
				System.out.println("4.2(100+ ratings), 350 INR for two");
				System.out.println("outlet-28 mins,mvp colony-delivery to rushikonda");
				System.out.println("Far(9.8)kms");
				break;
			}
			break;
		case "Idli":
			System.out.println("1)Sri Devi hotel\n 2)Lucky tiffins\n 3)Veg Delight");
			String idli=scan.next();
			switch(idli)
			{
			case "Sri Devi hotel":
				System.out.println("4.2(100+ ratings),150 INR for two");
				System.out.println("outlet-33 mins, sector 6-delievery to rushikonda");
				System.out.println("Far(9.5kms)");
				break;
			case "Lucky tiffins":
				System.out.println("4.4(100+ratings),150 INR for two");
				System.out.println("outlet-31 mins,sector 9-delievery to rushikonda");
				System.out.println("far(8.8kms)");
				break;
			case "Veg Delight":
				System.out.println("3.9(50+ ratings),200 INR for two");
				System.out.println("outlet-41 mins,madhurawada-delievery to rushikonda");
				System.out.println("Far(7kms)");
				break;
			}
			break;
		case "Paratha":
			System.out.println("1)Aroma multicuisine\n 2)six degrees");
			String paratha=scan.next();
			switch(paratha)
			{
			case "Aroma multicuisine":
				System.out.println("3.5(100+ ratings),300 INR for two");
				System.out.println("outlet-34 mins, chandrampalem-delievery to rushikonda");
				System.out.println("Far(7.1kms)");
				break;
			case "six degrees":
				System.out.println("4.2(100+ ratings),350 INR for two");
				System.out.println("outlet-45 mins, mvp colony-delievery to rushikonda");
				System.out.println("Far(9.6kms)");
				break;
			}
			break;
		case "Vada":
			System.out.println("1)Sri Devi hotel\n 2)Lucky tiffins\n 3)Veg Delight");
			String vada=scan.next();
			switch(vada)
			{
			case "Sri Devi hotel":
				System.out.println("4.2(100+ ratings),150 INR for two");
				System.out.println("outlet-33 mins, sector 6-delievery to rushikonda");
				System.out.println("Far(9.5kms)");
				break;
			case "Lucky tiffins":
				System.out.println("4.4(100+ratings),150 INR for two");
				System.out.println("outlet-31 mins,sector 9-delievery to rushikonda");
				System.out.println("far(8.8kms)");
				break;
			case "Veg Delight":
				System.out.println("3.9(50+ ratings),200 INR for two");
				System.out.println("outlet-41 mins,madhurawada-delievery to rushikonda");
				System.out.println("Far(7kms)");
				break;
			}
			break;
		case "Uttapam":
			System.out.println("1)Sri Devi hotel\n 2)Lucky tiffins\n 3)Veg Delight");
			String uttapam=scan.next();
			switch(uttapam)
			{
			case "Sri Devi hotel":
				System.out.println("4.2(100+ ratings),150 INR for two");
				System.out.println("outlet-33 mins, sector 6-delievery to rushikonda");
				System.out.println("Far(9.5kms)");
				break;
			case "Lucky tiffins":
				System.out.println("4.4(100+ratings),150 INR for two");
				System.out.println("outlet-31 mins,sector 9-delievery to rushikonda");
				System.out.println("far(8.8kms)");
				break;
			case "Veg Delight":
				System.out.println("3.9(50+ ratings),200 INR for two");
				System.out.println("outlet-41 mins,madhurawada-delievery to rushikonda");
				System.out.println("Far(7kms)");
				break;
			}
			break;
		}
		AddToCart.addToCart();
	}
}
