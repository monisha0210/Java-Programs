public class Rectangle
{
public static void main(String[] args)
{
 Rectangle rect = new Rectangle();
 int area = rect.RectArea(20,30);
 System.out.println("Area is =" +area);
 
}
public int RectArea(int a,int b)
{
 return a*b;
}
}