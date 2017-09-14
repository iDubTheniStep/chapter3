package Tutorial;
import java.util.Scanner;
public class DemoRise 
{

	public static void main(String[] args) 
	{
		double salary1 ;
		
		System.out.println("Please enter your salary");
		Scanner input = new Scanner(System.in);
		salary1 = input.nextDouble();
		
		System.out.println("Demostarting some raises");
		predictRaise(400.00);
		predictRaise(salary1);
		
	
				
	}
	public static void predictRaise(double salary)
	{
		double newSalary;
		final double RAISE_RATE = 1.10;
		newSalary = salary * RAISE_RATE;
		System.out.println("Current salary: " +salary +" After Raise: "+ newSalary );
		
		
	}

}
