import java.util.Scanner;
class EVM 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int bjp=0, cng=0,ss=0,aap=0,mns=0,nota=0;
		System.out.println();
		System.out.println("     Welcome  ");
		System.out.println();
		System.out.println("Enter the population");
		int population= sc.nextInt();

		for(int i=1; i<=population; i++)
		{
			System.out.println();
			System.out.println("***List of parties***");
			System.out.println("1.BJP");
			System.out.println("2.Congress");
			System.out.println("3.Shiv sena");
			System.out.println("4.AAP");
			System.out.println("5.MNS");
			System.out.println("6.Nota");
			System.out.println();
			System.out.println("Enter the option:");
			int opt = sc.nextInt();

			if(opt>=1 && opt<=6)
			{
				if(opt==1) 
					{
					bjp++; System.out.println("ache din ayenge");
					}
				if(opt==2){ cng++; System.out.println("bharat todo");}
			    if(opt==3){ ss++; System.out.println("huuu");}
				if(opt==4){ aap++;  System.out.println("hjhg");}
				if(opt==5){ mns++;  System.out.println("ghc");}
				if(opt==6){ nota++; System.out.println("Educated");}
			 }
			 if(!(opt>=1&& opt<= 6))
			{
					i--;
					System.out.println("invalid option");
			}
				
		  }      
		  
			if(bjp>=cng && bjp>=ss && bjp>=aap&& bjp>=mns&& bjp>=nota)
			{
				System.out.println("BJP won the election");
				return;
			}
			if(cng>=bjp && cng>=ss && cng>=aap&& cng>=mns&& cng>=nota)
			{
				System.out.println("cng won the election");
				return;
			}
			if(ss>=bjp && ss>=cng && ss>=aap&& ss>=mns&& ss>=nota)
			{
				System.out.println(" ss won the election");
				return;
			}
			if(aap>=bjp && aap>=cng && aap>=ss&& aap>=mns&& aap>=nota)
			{
				System.out.println("AAP won the election");
				return;
			}
			if(mns>=bjp && mns>=cng && mns>=ss&& mns>=aap&& mns>=nota)
			{
				System.out.println("mns won the election");
				return;
			}
			if(nota>=cng && nota>=ss && nota>=aap&& nota>=mns&& nota>=nota)
			{
				System.out.println("nota won the election");
				return;
			}

		

	  }
 }
