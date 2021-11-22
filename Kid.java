public class Kid extends Parents
{
String name;
public Kid(String name)
{
super(name);
this.name=name;
System.out.println("Child");
}
public static void main(String[] args)
{
Kid ch = new Kid("Moni");
}
}