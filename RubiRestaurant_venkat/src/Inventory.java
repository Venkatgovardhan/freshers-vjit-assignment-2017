import java.util.Scanner;

public class Inventory {// this class is just to visualize the inventory
	Scanner sc=new Scanner(System.in);
	int weightofnonveg,weightofveg,weightofdessert,weightofnonveg1,weightofveg1,weightofdessert1;
	void stockrem(int itemid)
	{
		System.out.println("Enter the weight of nonveg stock remaining in kilos");
		weightofnonveg=sc.nextInt();
		System.out.println("Enter the weight of veg stock remaining in kilos");
		weightofveg=sc.nextInt();
		System.out.println("Enter the weight of dessert stock remaining in kilos");
		weightofdessert=sc.nextInt();
		if(itemid<107&&itemid>100)
		{
			weightofnonveg1=weightofnonveg-1;
		}
		if(itemid<119&&itemid>112)
		{
			weightofveg1=weightofveg-1;
			
		}
		if(itemid<127&&itemid>120)
		{
			weightofdessert1=weightofdessert-1;
		}
		if(weightofnonveg1<weightofnonveg/2)
		{
			System.out.println("Manager refill nonveg stock");
		}
		if(weightofveg1<weightofveg/2)
		{
			System.out.println("Manager refill veg stock");
		}
		if(weightofdessert1<weightofdessert/2)
		{
			System.out.println("Manager refill dessert stock");
		}
		else
		{
			System.out.println("Stock is full");
		}
	}
}
