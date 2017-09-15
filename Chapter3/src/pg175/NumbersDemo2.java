package pg175;
import java.util.Scanner;
public class NumbersDemo2 
{

	public static void main(String[] args)
	{
		int A;
		int B;
		
		
		
		System.out.println("Please enter first number");
		Scanner input = new Scanner(System.in);
		A = input.nextInt();
		
		System.out.println("Please enter second Number");
		Scanner input1 = new Scanner(System.in);
		B = input1.nextInt();
		
		DisplayTwiceTheNumber(A , B);
		displayNumberPlusFive(A , B);
		DisplayNumberSquared(A , B);
	}
	public static void DisplayTwiceTheNumber(int TwiceTheNumber, int NumberTwice) 
	{
		int firstNumber;
		int secondNumber;
		
		firstNumber = TwiceTheNumber * 2;
		secondNumber = NumberTwice * 2;
		System.out.println(firstNumber);
		System.out.println(secondNumber);
	}
	public static void displayNumberPlusFive(int x, int y)
	{
		int firstNumber;
		int secondNumber;
		
		firstNumber = x+5;
		secondNumber = y+5;
		System.out.println(firstNumber);
		System.out.println(secondNumber);
			
	}
	public static void DisplayNumberSquared(int x, int y) 
	{
		int firstNumber;
		int secondNumber;
		
		firstNumber = x * x;
		secondNumber = y*y;
		
		System.out.println(firstNumber);
		System.out.println(secondNumber);
	}
}
