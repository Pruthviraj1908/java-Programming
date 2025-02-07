import java.util.Scanner;
class Evenodd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("entre a number");

		int num= sc.nextInt();
		String op= (num%2==0)?("is even"):("is odd");

		System.out.println(op);
	}
}
