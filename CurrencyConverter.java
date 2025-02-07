import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println();
		System.out.println("     CURRENCY CONVERTER");
		System.out.println();
		System.out.println("Enter the amount (INR)");
		float inr= sc.nextFloat();
		System.out.println();

		System.out.println("LIST OF CURRENCY");
		System.out.println("1.USD");
		System.out.println("2.EUR");
		System.out.println("3.GBP");
		System.out.println("4.PKR");
		System.out.println();
		System.out.println("Enter the Currency");
		System.out.println();
		String curr=sc.next().toUpperCase();
		float ConCurr= 0;
		if(curr.equals("USD"))
		{
			ConCurr=inr/86.56f;
			System.out.println(inr+" INR="+ConCurr+"USD");
		}
		else if(curr.equals("EUR"))
		{
			ConCurr=inr/90.25f;
			System.out.println(inr+"INR="+ConCurr+"EUR");
		}
		else if(curr.equals("GBP"))
		{
			ConCurr=inr/90.25f;
			System.out.println(inr+"INR="+ConCurr+"GBP");
		}
		else if(curr.equals("PRK"))
		{
			ConCurr=inr/90.25f;
			System.out.println(inr+"INR="+ConCurr+"PRK");
		}

	}
}
