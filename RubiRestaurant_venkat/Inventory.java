import java.util.Scanner;

public class Inventory {
	Scanner sc=new Scanner(System.in);
	int weightofnonveg,weightofveg,weightofdessert;
	void stockrem(int itemid)
	{
		System.out.println("Enter the weight of nonveg stock rem in kilos");
		weightofnonveg=sc.nextInt();
		System.out.println("Enter the weight of veg stock rem in kilos");
		weightofveg=sc.nextInt();
		System.out.println("Enter the weight of dessert stock rem in kilos");
		weightofdessert=sc.nextInt();
		if(itemid<107&&itemid>100)
		{
			weightofnonveg=weightofnonveg-1;
		}
		if(itemid<119&&itemid>112)
		{
			weightofveg=weightofveg-1;
			
		}
		if(itemid<127&&itemid>120)
		{
			weightofdessert=weightofdessert-1;
		}
		if(weightofnonveg<weightofnonveg)
		{
			System.out.println("Manager refill nonveg stock");
		}
		if(weightofveg<weightofveg/2)
		{
			System.out.println("Manager refill veg stock");
		}
		if(weightofdessert<weightofdessert/2)
		{
			System.out.println("Manager refill dessert stock");
		}
		else
		{
			System.out.println("stock is full");
		}
	}
}
