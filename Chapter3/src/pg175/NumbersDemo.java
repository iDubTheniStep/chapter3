package pg175;

public class NumbersDemo
{
	public static void main(String[] args)
	{
		
		int A = 12;
		int B = 10;
		DisplayTwiceTheNumber(A , B);
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
