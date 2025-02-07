import java.util.Scanner;
class Adult
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age ");
		int age=sc.nextInt();
		
		String agee = (age>18)?(age+" yrs is Adult"):(age+" yrs is not Adult");
		System.out.println(agee);

	}
}
