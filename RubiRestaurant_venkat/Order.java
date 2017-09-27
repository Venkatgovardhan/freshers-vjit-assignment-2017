import java.util.Map;
import java.util.Scanner;

public class Order extends Menu {
	public void order()
	{
		Scanner sc=new Scanner(System.in);
		int ch,itemId,need = 0,totalcost=0;
		String bill="";
		System.out.println("Please order what you want sir here is the Menu !!!");
		do
		{
			System.out.println("enter 1:for veg tadka and desserts\n"
				+ "2:for desserts 3:for full menu\n4:to quit");
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
			}
			for(Map.Entry m:itemName.entrySet()){  
				if(m.getKey().equals(itemId))
					{System.out.print("Item name:"+m.getValue());
					for(Map.Entry n:itemPrice.entrySet())
					{	if(n.getKey().equals(itemId))
						{
						System.out.println("  cost:"+n.getValue());
						System.out.print(" Enter Quantiy: ");
						int q=sc.nextInt();
						int cost =((int) n.getValue())*q;
						totalcost+=cost;
						String receipt="Item ordered= "+m.getValue()+"cost= "+n.getValue()+" quantity= "+q+"final cost="+totalcost+"\n";
						bill+=" "+receipt;
						System.out.println(receipt);
						
						
						
						System.out.println("do you want to order more enter 1 for yes 0 for no");
						need=sc.nextInt();
						}
						
						}
					}
		
			}			
		}while(need==1);
	}

}
