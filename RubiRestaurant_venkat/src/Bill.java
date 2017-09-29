
public class Bill {
	void Receipt(String bill,int totalamount)
	{
		System.out.println("***RubiRestaurant***");
		System.out.println(bill);
		System.out.println("amount to be paid:"+totalamount);
		System.out.println("\n\nProceeding for Payment...");
		Payment p=new Payment();
		p.pay(totalamount);
	}
	
}
