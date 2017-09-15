package DelgadosTacos;
import java.util.Scanner;
import java.text.DecimalFormat;
public class DelgadosTacos
{

	public static void main(String[] args) 
	{
		double tacoPrice = 1.00;
		double Nachos = .99;
		double Quesadilla = 3.00;
		double Burrito = 2.00;
		double CrunchWrap = 2.50;
		double supremetaco = 1.30;
		double supremeBurrito = 2.30;
		double tacoSalad = 4.70;
		double mexicanPizza = 2.99;
		double supremeNachos = 2.19;
		
		double tacoPriceOrderd;
		double NachosOrderd;
		double QuesadillaOrderd;
		double BurritoOrderd;
		double CrunchWrapOrderd;
		double supremetacoOrderd;
		double supremeBurritoOrderd;
		double tacoSaladOrder;
		double mexicanPizzaOrderd;
		double supremeNachosOrderd;
		
		System.out.println("How many tacos were you wanting?");
		Scanner input = new Scanner(System.in);
		tacoPriceOrderd = input.nextInt();
		
		System.out.println("How many Nachos were you wanting?");
		Scanner input1 = new Scanner(System.in);
		NachosOrderd = input.nextInt();
		
		System.out.println("How many Burrito were you wanting?");
		Scanner input2 = new Scanner(System.in);
		QuesadillaOrderd = input.nextInt();
		
		System.out.println("How many Quesadillas were you wanting?");
		Scanner input3 = new Scanner(System.in);
		BurritoOrderd = input.nextInt();
		
		System.out.println("How many Crunch Wraps  were you wanting?");
		Scanner input4 = new Scanner(System.in);
		CrunchWrapOrderd = input.nextInt();
		
		System.out.println("How many supreme tacos  were you wanting?");
		Scanner input5 = new Scanner(System.in);
		supremetacoOrderd = input.nextInt();
		
		System.out.println("How many supreme Burritos were you wanting?");
		Scanner input6 = new Scanner(System.in);
		supremeBurritoOrderd = input.nextInt();
		
		System.out.println("How many tacoSalad were you wanting?");
		Scanner input7 = new Scanner(System.in);
		tacoSaladOrder = input.nextInt();
		
		System.out.println("How many mexican Pizzas were you wanting?");
		Scanner input8 = new Scanner(System.in);
		mexicanPizzaOrderd = input.nextInt();
		
		System.out.println("How many supreme Nachos were you wanting?");
		Scanner input9 = new Scanner(System.in);
		supremeNachosOrderd = input.nextInt();
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		double totaltacoPriceOrderd = tacoPrice *tacoPriceOrderd ;
		double totalNachosOrderd =  Nachos * NachosOrderd;
		double totalQuesadillaOrderd = QuesadillaOrderd * Quesadilla ;
		double totalBurritoOrderd = Burrito * BurritoOrderd;
		double totalCrunchWrapOrderd = CrunchWrapOrderd * CrunchWrap;
		double totalsupremetacoOrderd = supremetaco * supremetacoOrderd;
		double totalsupremeBurritoOrderd = supremeBurrito * supremeBurritoOrderd;
		double totaltacoSaladOrder = tacoSaladOrder *  tacoSalad;
		double totalmexicanPizzaOrderd = mexicanPizzaOrderd * mexicanPizza ;
		double totalsupremeNachosOrderd = supremeNachosOrderd * supremeNachos;
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		double totalPrice = totaltacoPriceOrderd + totalNachosOrderd + totalQuesadillaOrderd + totalBurritoOrderd +  totalCrunchWrapOrderd + 
				totalsupremetacoOrderd + totalsupremeBurritoOrderd+ totaltacoSaladOrder+ totalmexicanPizzaOrderd+totalsupremeNachosOrderd;
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("you have ordered " + tacoPriceOrderd + " Taco(s) at "+ tacoPrice +" each. it will cost a total of "+ totaltacoPriceOrderd);
		
		System.out.println("you have ordered " + NachosOrderd + " Nacho(s) at "+ Nachos +" each. it will cost a total of "+ totalNachosOrderd);
		
		System.out.println("you have ordered " +  QuesadillaOrderd + " Quesadilla(s) at "+ Quesadilla +" each. it will cost a total of "+ totalQuesadillaOrderd);
		
		System.out.println("you have ordered " + BurritoOrderd + " Burrito(s) at "+ Burrito +" each. it will cost a total of "+totalBurritoOrderd);
		
		System.out.println("you have ordered " + CrunchWrapOrderd + " CrunchWrap(s) at "+  CrunchWrap +" each. it will cost a total of "+totalCrunchWrapOrderd);
		
		System.out.println("you have ordered " + supremetacoOrderd + " supreme taco(s) at "+ supremetaco +" each. it will cost a total of "+ totalsupremetacoOrderd);
		 
		System.out.println("you have ordered " + supremeBurritoOrderd + " supreme Burrito(s) at "+ supremeBurrito+" each. it will cost a total of "+ totalsupremeBurritoOrderd);
		
		System.out.println("you have ordered " + tacoSaladOrder + " taco Salad(s) at "+ tacoSalad +" each. it will cost a total of "+ totaltacoSaladOrder);
		
		System.out.println("you have ordered " + mexicanPizzaOrderd + " mexican Pizza(s) at "+ mexicanPizza +" each. it will cost a total of "+ totalmexicanPizzaOrderd);
		
		System.out.println("you have ordered " + supremeNachosOrderd + " supreme nacho(s) at "+ supremeNachos +" each. it will cost a total of "+ totalsupremeNachosOrderd);
		salesTax(totalPrice);
		
	}
	
		
		
		
		public static void salesTax(double totalPriceFromMain)
		 
		{
			
			double TotalWithTax = totalPriceFromMain *1.075;
			System.out.println("Your total before tax is " + totalPriceFromMain);
		System.out.println("Your total after is " + TotalWithTax);
		
		}

	public static void tacoTruck() 
	{
		System.out.println("xxxxxxxxx");
		System.out.println("x tacos x ");
		System.out.println("xxxxxxxxxxxxx");
		System.out.println("xxxxxxxxxxxxx");
		System.out.println(" O         O");
	}
	
}
