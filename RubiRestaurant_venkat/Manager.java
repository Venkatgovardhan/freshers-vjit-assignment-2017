import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Manager {
	int nooftables;
	String customername;
	int tableno;
	Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
	Scanner sc=new Scanner(System.in);
	public void customerdetails(int tables)
	{
		System.out.println("Enter the customer name");
		customername=sc.next();
		System.out.println("enter the table number alloted");
		tableno=sc.nextInt();
		if((tableno>tables)&&(tableno<=0))
		{
			System.out.println("enter correct table number");
		}
		else
		{
			ht.put(tableno,customername);
			Order o=new Order();
			o.order(customername);
		}
		
	}
	public void customerexit()
	{
		System.out.println("enter the table number which has been left");
		int t=sc.nextInt();
		ht.remove(t);
		System.out.println("table"+t+"is free to be allocated");
	}
	
		
}
