public class Triangle
{
public static void main(String[] args)
{
 Triangle triangle = new Triangle();
 int area = triangle.TRIArea(8,4);
 System.out.println("Area is =" +area);
 
}
public int TRIArea(int a,int b)
{
 return (a*b)/2;
}
}