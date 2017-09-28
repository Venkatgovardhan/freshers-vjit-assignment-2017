import java.util.Scanner;

public class Chef {
	Scanner sc=new Scanner(System.in);
	Inventory i=new Inventory();
	void prepareorder(int itemid,String itemname)
	{
		System.out.println("Order:"+itemname+" is ready to be served\n\n");
		System.out.println("checking stock in inventory");
		i.stockrem(itemid);
	}

}
