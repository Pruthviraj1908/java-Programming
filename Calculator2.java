import java.util.Scanner;
class Calculator2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1 : ");
		float num1 = sc.nextFloat();
		System.out.println("Enter num2 : ");
		float num2 = sc.nextFloat();
		System.out.println("Enter an operator: ");
		char op=sc.next().charAt(0);
		float opt=
			(op=='+')?num1+num2:
            (op=='-')?num1-num2:
			(op=='*')?num1*num2:
            (op=='/')?num1/num2:
			(op=='%')?num1%num2:0.000001f;
		if(opt==0.000001f)
		{

	
			System.out.println("invalid operator");
		}
		else
		{
			System.out.println(opt);
		}
		if(!(opt==0.000001f))
		{

		String output= (num1+" "+op+" "+num2 +" = "+opt);
		}
		
			
		


	}
}
