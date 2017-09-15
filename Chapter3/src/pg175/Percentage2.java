package pg175;
import java.util.Scanner;
public class Percentage2
{

	public static void main(String[] args) 
	{
		double one;
		double two;
		
		System.out.println("Please enter first number");
		Scanner input = new Scanner(System.in);
		one = input.nextInt();
		
		System.out.println("Please enter second Number");
		Scanner input1 = new Scanner(System.in);
		two = input1.nextInt();
		
		computePercent(one,two);
		computePercent(two,one);
		
	}
	public static void computePercent(double percentOne, double percentTwo)
	{
		double percent;
		
		percent = (percentOne / percentTwo)*100 ; 
		
		System.out.println(percent + " is the percentage of  " + percentOne+" " + percentTwo );
		
	}

}
