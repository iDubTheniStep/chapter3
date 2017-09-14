package youDoIt;
import java.util.Scanner;
public class CreateSpaService 
{
	public static void main (String[] args)
	{
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		firstService = getData(firstService);
		secondService = getData(secondService);
		
		
		String service;
		double price;
	
		
		System.out.println("Enter service");
		Scanner keyboard = Scanner(System.in);;
		service = keyboard.nextLine();
		System.out.println("Enter Price");
		price = keyboard.nextDouble();
		
		
	
	firstService = getData(firstService);
	secondService = getData(secondService);
	
		
		
		System.out.println("First service details:");
		System.out.println(firstService.getServiceDescription() +"$"+ firstService.getPrice());
		System.out.println("Second service details:");
		System.out.println(secondService.getServiceDescription() +"$"+ secondService.getPrice());		
		
	}
	public static SpaService getData(SpaService s)
	{
		String service;
		double price;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Enter service");
		service = inputDevice.nextLine();
		System.out.println("Enter price");
		price = inputDevice.nextDouble();
		
		
		s.setServiceDescription(service);
		s.setPrice(price);
		return s; 
	}
}
