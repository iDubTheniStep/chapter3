package pg175;

public class Percentages 
{

	public static void main(String[] args) 
	{

		double one = 40.0 ;
		double two = 80.0 ;
		
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
