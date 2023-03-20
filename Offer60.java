package swiggyproject;
import java.util.Scanner;
public class Offer60 {
	public static void offer60() {
		Scanner scan=new Scanner(System.in);
		System.err.println("Get 60% OFF");
		System.err.println("On your tasty treats");
		System.err.println("Use code WELCOMEBACK");
		System.err.println("Top offers on your favourite cuisines");
		System.out.println("Burger\n Pizza\n Biryani\n Chinese\n South Indian\n North Indian");
		String food1=scan.nextLine();
		switch(food1)
		{
		case "Burger":
			System.out.println("Mexico's Chicken Poppers\n Bunnies Burger\n Vegas Express");
			String burger=scan.nextLine();
			switch(burger)
			{
			case "Mexico's Chicken Poppers":
				System.out.println("3.9(100+ ratings, 250 INR for two");
				System.out.println("Outlet-41 min, Sector5-Delievery to Rushikonda");
				System.out.println("Far(9.3km)");
				break;
			case "Bunnies Burger":
				System.out.println("3.7(50+ ratings,200 INR for two");
				System.out.println("Outlet-34min, Madhurawada-Delievery to Rushikonda");
				System.out.println("Far(7.4kms)");
				break;
			case "Vegas Express":
				System.out.println("Too few ratings, 200 INR for two");
				System.out.println("Outlet-37 min, Madhurawada-Delievery to Rushikonda");
				System.out.println("Far(5.6kms)");
				break;
			}
			break;
		case "Pizza":
			System.out.println("Tibb Frankie\n Brew n Bistro\n Baker's pride");
			String pizza=scan.nextLine();
			switch(pizza)
			{
			case "Tibb Frankie":
				System.out.println("4.3(20+ ratings), 100 INR for two");
				System.out.println("Outlet-37 mins, MVP colony-Delievery to Rushikonda");
				System.out.println("Far(9.8kms)");
				break;
			case "Brew n Bistro":
				System.out.println("3.9(100+ ratings), 350 INR for two");
				System.out.println("Outlet-46mins, Lawsons Bay colony-Delievery to Rushikonda");
				System.out.println("Far(9.8kms)");
				break;
			case "Baker's pride":
				System.out.println("3.8(20+ ratings,200 INR for two");
				System.out.println("Outlet-28 mins, Madhurawada-Delievery to Rushikonda");
				System.out.println("Far(5.6kms)");
				break;
			}
			break;
		case "Biryani":
			System.out.println("Hyderabad Bawarchi Dum Biryani\n Paradise Biryani");
			String biryani=scan.nextLine();
			switch(biryani)
			{
			case "Hyderabad Bawarchi Dum Biryani":
				System.out.println("3.8(100+ ratings),250 INR for two");
				System.out.println("Outlet-33mins, Madhurawada-Delievery to Rushikonda");
				System.out.println("Far(5kms)");
				break;
			case "Paradise Biryani":
				System.out.println("3.5(1k+ratings),400 INR for two");
				System.out.println("outlet-35mins,pothinmallayya palem-delievery to rushikonda");
				System.out.println("Far(6.4kms)");
				break;
			}
			break;
		case "Chinese":
			System.out.println("Teenage point\n Aroma multicuisine\n");
			String chinese=scan.nextLine();
			switch(chinese)
			{
			case "Teenage point":
				System.out.println("3.8(100+ ratings),150 INR for two");
				System.out.println("outlet-35mins,150 INR for two");
				System.out.println("sector 12-Delievery to rushikonda");
				break;
			case "Aroma multicuisine":
				System.out.println("3.5(100+ ratings),300 INR for two");
				System.out.println("Outlet-40mins,chandrampalem-delievery to rushikonda");
				System.out.println("Far(7.1)kms");
				break;
			}
			break;
		case "South Indian":
			System.out.println("Nalabhimas\n Atharillu");
			String south=scan.nextLine();
			switch(south)
			{
			case "Nalabhimas":
				System.out.println("4.4(1k+ ratings),200 INR for two");
				System.out.println("outlet-26 mins,yendada-delievery to rushikonda");
				System.out.println("3kms");
				break;
			case "Atharilu":
				System.out.println("3.9(20+ ratings),200INR for two");
				System.out.println("Outlet-30mins, Madhurawada -Delievery to rushikonda");
				System.out.println("Far(5kms)");
				break;
			}
			break;
		case "North Indian":
			System.out.println("Yasoddha\n Kamat");
			String north=scan.nextLine();
			switch(north)
			{
			case "Yasoddha":
				System.out.println("3.8(100+ ratings),250 INR for two");
				System.out.println("outlet-40mins,shivaji park road-delievery to rushikonda");
				System.out.println("Very far(11.1)kms");
				break;
			case "Kamat":
				System.out.println("4.2(500+ratings),250 INR for two");
				System.out.println("outlet-29mins,mvp colony-delievery to rushikonda");
				System.out.println("Far(9.6kms)");
				break;
			}
			break;
		}
		AddToCart.addToCart();
			
		}
}
