import java.util.Scanner;
class passfail
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		float marks=sc.nextInt();
		System.out.println("Enter the marks");
		float percent=(marks*100)/600;
		String op=(percent>=75)?grade :
			((percent>=35)?("fail"):(""));
		System.out.println("op");
	}
}
