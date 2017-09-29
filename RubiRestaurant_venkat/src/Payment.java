import java.util.Scanner;

public class Payment {
	void pay(int amounttobepaid)
	{Scanner sc=new Scanner(System.in);
	System.out.println("Select the Payment Type");
	System.out.println("1.CASH");
	System.out.println("2.Debit Card");
	System.out.println("3.PayTm");
	
	int choice=sc.nextInt();
	switch(choice)
	{case 1:
		System.out.print("Enter Cash ");
		int amountgiven=sc.nextInt();
		if(amountgiven<amounttobepaid)
		{int diff=amounttobepaid-amountgiven;
			System.out.print(" you need to give more "+diff+"rupees");
			pay(diff);
			break;	
		}
		if(amountgiven>amounttobepaid)
		{
			System.out.println(" here are your "+(amountgiven-amounttobepaid)+"rupees");
		}
		break;
	case 2:
		System.out.println("Swipe Card");
		break;
	case 3:System.out.println("Pay on this 7207054787");
		break;
	}System.out.println("Payment done");
	System.out.println("Please give your feedback");
	String feedback=sc.next();
	System.out.println("*****Thank you for visiting*****\n\n\n");
	}
	

}
