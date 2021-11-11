public class ConstructorLearning
{
	public ConstructorLearning() //no arguments constructor
	{
		System.out.println("Check");
	}
	public ConstructorLearning(String brand)
	{
		System.out.println(brand);
	}
	public ConstructorLearning(int num)
	{
		System.out.println(num);
	}
	public static void main(String[] args)
	{

		ConstructorLearning cl1 = new ConstructorLearning();
		ConstructorLearning cl2 = new ConstructorLearning();
		ConstructorLearning cl3 = new ConstructorLearning("abcde");
		ConstructorLearning cl4 = new ConstructorLearning(2021);
	}
}
