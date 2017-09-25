import java.util.*;
public class Menu {
	ArrayList<String> hsi=new ArrayList<String>();
	ArrayList<Integer> hsc=new ArrayList<Integer>();
	public void ItemMenu(int noofitems)
	{
		int i,n;
		n=noofitems;
		String item;
		int itemcost;
		Scanner key=new Scanner(System.in);
		for(i=0;i<n;i++)
		{
			System.out.println("enter the items");
			item=key.nextLine();
			hsi.add(item);
			
		}
		for(i=0;i<n;i++)
		{
			System.out.println("enter the cost");
			itemcost=key.nextInt();
			hsc.add(itemcost);
		}
	}
	public void Todaymenu()
	{
		Iterator<String> iti=hsi.iterator();
		Iterator<Integer> itc=hsc.iterator();
		System.out.println("________Today's Special__________");
		while(iti.hasNext())
		{
			System.out.print(iti.next()+":");
			System.out.println(itc.next()+"rs");
		}
	}
}
