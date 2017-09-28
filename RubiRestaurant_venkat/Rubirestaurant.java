import java.util.Scanner;

public class Rubirestaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome To Restaurant Rubi");
		System.out.println("Host venkat at your service sir");
		System.out.println("how many tables do you want sir");
		Scanner sc=new Scanner(System.in);
		int rtables=sc.nextInt();
		Callmanager m=new Callmanager();
		m.manager(rtables);
		
		
	}

}
