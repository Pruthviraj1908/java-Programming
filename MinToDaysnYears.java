import java.util.Scanner;
class MinToDaysnYears
 
{
	public static void main(String[] args) 
	 {
		Scanner sc = new Scanner(System.in);    
		System.out.println("Enter min");
		int min= sc.nextInt();
		int minyear = 365*24*60;
		int years = min / minyear;
		int days = (min % minyear)/(24*60);
		System.out.println("Enter min" + min );
		System.out.println("yeras"+ years + "\n days " + days);

	}
}
