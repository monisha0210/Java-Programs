public class Bakery
{
static String bakery_name = "Monisha";
int doorNo = 4;
int price;
public static void main(String[] args)
{
Bakery cake = new Bakery();
	cake.price = 20;
Bakery cool_Drink = new Bakery();
	cool_Drink.price = 30;
Bakery vadai = new Bakery();
	vadai.price = 5;
Bakery bonda = new Bakery();
	bonda.price = 10;
	System.out.println(bakery_name);
	System.out.println( cake.price);
	System.out.println(cool_Drink.price);
	System.out.println(vadai.price);
	System.out.println(bonda.price);
}
}