import java.util.*;
public class Menu {
	Hashtable<Integer,String> itemName=new Hashtable<Integer,String>();
	Hashtable<Integer,Integer> itemPrice=new Hashtable<Integer,Integer>();
	void nonveg()
		{
			itemName.put(100,"chicken 65");  
			itemName.put(101,"Grilled chicken");  
			itemName.put(102,"Mutton korma");  
			itemName.put(103,"Tandoori lamb chops");  

			itemName.put(104,"Chicken Biryani");  
			itemName.put(105,"Mutton Biryani");  
			itemName.put(106,"Malabar fish biryani");  
			itemName.put(107,"Keema samosa");
			itemPrice.put(100,80);  
			itemPrice.put(101,70);  
			itemPrice.put(102,120);  
			itemPrice.put(103,150);  
			itemPrice.put(104,180);  
			itemPrice.put(105,250);  
			itemPrice.put(106,350);  
			itemPrice.put(107,100);  
			veg();
		}
	void veg()
	{

		itemName.put(112,"Makhni paneer biryani");  
		itemName.put(113,"Masala bhindi");  
		itemName.put(114,"Pommes gratin");  
		itemName.put(115,"Chole bhature");  

		itemName.put(116,"Masala chana");  
		itemName.put(117,"Mushroom kofta");  
		itemName.put(118,"Matar panner");  
		itemName.put(119,"Aalu paratha");  
		
		itemPrice.put(112,80);  
		itemPrice.put(113,40);  
		itemPrice.put(114,50);  
		itemPrice.put(115,30);  
		itemPrice.put(116,30);  
		itemPrice.put(117,60);  
		itemPrice.put(118,40);  
		itemPrice.put(119,20);
		desserts();
	}
	void desserts()
	{
		itemName.put(120,"Apple Pie");  
		itemName.put(121,"Almond mallai kulfi");  
		itemName.put(122,"Lemon Tart");  
		itemName.put(123,"Brownies");  

		itemName.put(124,"Tiramisu");  
		itemName.put(125,"Coconut Kheer");  
		itemName.put(126,"Chocolate Cofee Truffle");  
		itemName.put(127,"Chocolate Mousee");
		itemPrice.put(120,80);  
		itemPrice.put(121,40);  
		itemPrice.put(122,60);  
		itemPrice.put(123,100);  
		itemPrice.put(124,80);  
		itemPrice.put(125,60);  
		itemPrice.put(126,75);  
		itemPrice.put(127,90);  
		
		System.out.println("ItemId   Itemname");
		for(Map.Entry m:itemName.entrySet()){
			int i=(int) m.getKey();
			//if(i>112)
			//{
				//System.out.print("");
				//}
		
				System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		
	}
}
