import java.util.Scanner;

public class Menumain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Menu m=new Menu();
		Customer c=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To The Restaurant Manager");
		System.out.println("Enter number of items in todays's menu");
		int n=sc.nextInt();
		m.ItemMenu(n);
		System.out.println("enter number of tables");
		int t=sc.nextInt();
		System.out.println("Please select what you what to sir!");
		do
		{
			System.out.println("enter 1:to register customer and allocate table\n"
					+ "2:--------3:to free the table\n4:to quit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			c.customerdetails(t);
			break;
			case 3:c.customerexit();
				break;
			case 4:ch=0;
			break;
			}
		}while(ch!=0);
		c.customers();
		
		System.out.println("we are done for today Good night Manager!!!");
		
	}

}
