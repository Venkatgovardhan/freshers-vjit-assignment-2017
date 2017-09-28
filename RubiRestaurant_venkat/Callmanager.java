import java.util.*;

public class Callmanager {
	public void manager(int rtables)
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		Manager m=new Manager();
		Boy b=new Boy();
		System.out.println("Welcome To The Restaurant Manager");
		System.out.println("enter number of tables");
		int t=sc.nextInt();
		int i=1;
		if(t>=rtables)
		{
			System.out.println("Please select what you what to sir!");
			do
			{
				System.out.println("enter 1:to register customer and allocate table\n"
					+ "2:to free the table\n3:to quit");
				ch=sc.nextInt();
				switch(ch)
				{
					case 1:if(i<=rtables)
					{
						b.servewater();
						m.customerdetails(t);
					}
					else
					{
						System.out.println("no more customer to be attended sir!");
					}
					i++;	
					break;
					case 2:m.customerexit();
					break;
					case 3:ch=0;
					break;
				}
			}while(ch!=0);
		}
		
		else
		{
			System.out.println("no vacancy sir sorry!!! you have to wait");
		}
		
			System.out.println("we are done for today Good night Manager!!!");
	}

}
