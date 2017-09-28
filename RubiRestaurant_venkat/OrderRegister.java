import java.util.Hashtable;
import java.util.Map;

public class OrderRegister {
	Hashtable<Integer,String> item=new Hashtable<Integer,String>();
	Hashtable<Integer,Integer> itemquant=new Hashtable<Integer,Integer>();
	void ordersoftheday(int itemid,String itemname,int quantity)
	{
	
		item.put(itemid,itemname);
		itemquant.put(itemid,quantity);
	}
	void showorderRegister()
	{
		System.out.println("ItemName\t Quantity");
		for(Map.Entry m:item.entrySet()){ 
			for(Map.Entry n:itemquant.entrySet())
			{	if(n.getKey().equals(m.getKey()))
			{
				System.out.println(m.getValue()+"\t"+n.getValue());
			}
			}
		}
	}

}
