import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Customer {
	int nooftables;
	String customername;
	int tableno;
	LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
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
			lhm.put(tableno,customername);
		}
		
	}
	public void customerexit()
	{
		System.out.println("enter the table number which has been left");
		int t=sc.nextInt();
		lhm.remove(t);
		System.out.println("table"+t+"is free to be allocated");
	}
	public void customers()
	{
		Set s=lhm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
		
}
