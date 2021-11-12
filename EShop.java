public class EShop
{
int price;
private	String profit= "30%";
public EShop()
{
 System.out.println("Dec 31- Rs.300/- Offer");
}
public EShop(int price)
{
this();//Explicit call of constructor
this.price=price;
	System.out.println("Your Bill is=" + price);
}
public static void main(String[] args)
{
EShop tv =new EShop(10000);
EShop fridge = new EShop(25000);
	EShop enquiry = new EShop();
	tv.purchase(1000);
	fridge.purchase();
	tv.profit();
}
	//Method Overloading - Compile time Pholymorpism
	public void purchase(int discount)
	{
		System.out.println(discount);
	}
	public void purchase()
	{
		System.out.println("No Discount");
	}
	private void profit()
	{
		System.out.println(profit);
	}
}