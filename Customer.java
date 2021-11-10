public class Customer
{
int amount=500;
public static void main(String[] args)
{
Customer Customer1 = new Customer();
int balance = Customer1.purchase(200);
Customer1.pay(balance);
	System.out.println(Customer1.amount);
	Customer Customer2 = new Customer();
	System.out.println(Customer2.amount);
	
}
	public void pay(int balance)
	{
      System.out.println("My balance is" +balance);
	}
	public int purchase(int ip)
	{
		amount =amount-ip;
		System.out.println(amount);
		return amount;
	}
}
