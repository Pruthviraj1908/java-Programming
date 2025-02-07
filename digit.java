import java.util.Scanner;
class digit 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a digit:");
		char ch = sc.next().charAt(0);
		String cha = ((ch >='0' && ch <= '9')?( "is digit"):
			("is not a digit"));
		System.out.println(cha);

	}
}
