import java.util.Scanner; 
class Areaofcircle 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the radius of circle");
		Scanner sc = new Scanner (System.in);
		final double pi=22/7;
		
		
		double r = sc.nextDouble();
		double Area = pi*r*r;
		System.out.println("Area of circle is:" + Area+ " sqcm ");
	}
}
