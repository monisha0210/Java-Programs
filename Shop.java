public class Shop
{
 int price,discount;
 String brand;
	public Shop(String brand ,int price,int discount)
	{
		//System.out.println("Check");
		this.price=price;
		this.brand=brand;
		this.discount=discount;
	}
 public static void main(String[] args)
 {
	 Shop prod1 = new Shop("ABCD",100,50);
	 System.out.println(prod1.brand);
	 System.out.println(prod1.price);
	 System.out.println(prod1.discount);
	 //prod1.brand = "ABCD";
	 //prod1.price=100;
	 //prod1.discount=50;
	 Shop prod2 = new Shop("PQRS",200,100);
	 System.out.println(prod2.brand);
	 System.out.println(prod2.price);
	 System.out.println(prod2.discount);
	 //prod2.brand = "PQRS";
	 //prod2.price=200;
	 //prod3.discount=100;
 }
}