import java.util.Scanner;
class BMI 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		final double pound=0.45359237;
		final double inch=0.0254;
		System.out.println("enter the weight in pounds:");
		double weight= sc.nextDouble();
		double kg = weight*pound;
		System.out.println("enter the height in inch:");
		double height= sc.nextDouble();
		double meter = height*inch;
		double bmi= kg/(meter*meter);



		System.out.println("BMI is"+bmi);
	}
}
