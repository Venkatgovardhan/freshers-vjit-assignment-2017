import java.util.Map;
import java.util.Scanner;

public class Order extends Menu{
	OrderRegister or=new OrderRegister();
	Bill b=new Bill();
	Chef c=new Chef();
	public void order(String customername)
	{
		Scanner sc=new Scanner(System.in);
		int ch,itemId,need = 0,totalcost=0;
		String bill="";
		System.out.println("Please select the Menu !!!");
		do
		{
			System.out.println("enter 1:for veg tadka and desserts\n"
				+ "2:for desserts 3:for full menu\n4:to quit and order");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:veg();	
				break;
				case 2:desserts();
				break;
				case 3:nonveg();
				case 4:ch=0;
				break;
			}
		}while(ch!=0);
		do
		{
			System.out.println("enter the ItemId you want to order");
			itemId=sc.nextInt();
			if(itemId>127||itemId<100)
			{
				System.out.println("enter valid itemId please!!!");
				System.out.println("enter the ItemId you want to order");
				itemId=sc.nextInt();
			}
			for(Map.Entry m:itemName.entrySet()){  
				if(m.getKey().equals(itemId))
					{System.out.print("Item name:"+m.getValue());
					for(Map.Entry n:itemPrice.entrySet())
					{	if(n.getKey().equals(itemId))
						{String name=(String) m.getValue();
						System.out.println("  cost:"+n.getValue());
						System.out.print(" Enter Quantiy: ");
						int q=sc.nextInt();
						or.ordersoftheday(itemId,name,q);
						c.prepareorder(itemId,name);
						int cost =((int) n.getValue())*q;
						totalcost+=cost;
						String receipt="Item ordered= "+m.getValue()+"cost= "+n.getValue()+" quantity= "+q+"\n";
						bill+=" "+receipt;										
						System.out.println("do you want to order more enter 1 for yes 0 for no");
						need=sc.nextInt();
						}
						
						}
					}
		
			}	
		}while(need==1);
		System.out.println("here is the bill sir");
		b.Receipt(bill,totalcost);
			System.out.println("These are the orders of the day till now Manager ji !!!");
			or.showorderRegister();
	}

}
