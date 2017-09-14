package youDoIt;

import java.util.Scanner;

public class ParadiseInfo 
{
	public static void main(String[] args) 
	{
		
		
		
	double price;
	double discount;
	double savings;
	
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter cutoff prive for discount >");
	price= keyboard.nextDouble();
	
	System.out.println("Enter discout rate as a whole number");
	discount = keyboard.nextDouble();
	
	savings = computeDiscountInfo(price,discount);
	
	
	System.out.println("Special this week on any service over "+ price);
	System.out.println("Discount of "+discount+ "percent");
	System.out.println("That's savings of atlease $"+savings);
	
	
	}
	
	public static double computeDiscountInfo(double pr, double dscnt)
	{
		double savings;
		savings = pr * dscnt / 100;
		return savings; 
	}
	
}
