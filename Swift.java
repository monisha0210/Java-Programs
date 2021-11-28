public class Swift extends MarutiCar
{
public static void main(String[] args)
{
Swift red = new Swift();
red.sit();
red.design();
red.fixAirBags();
//Method Overriding
MarutiCar mc = new Swift();
}
public void fixAirBags()
{
System.out.println(4);
}
public void sit()
{
System.out.println(5);
}
public void design()
{
System.out.println("new");
}
}