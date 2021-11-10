public class Circle
{
public static void main(String[] args)
{
 Circle circle = new Circle();
 double area = circle.CalculateArea(3.14,6);
 System.out.println("Area is =" +area);
 
}
public double CalculateArea(double Pi,double r)
{
	return Pi*r*r;
}
}