package tamilnadu.chennai;

public class Office
{
	int ta = 100;
	public static void main(String[] args)
	{
		Office employee1 = new Office();
		System.out.println("Check");
		employee1.giveSnacks();
		employee1.work();
	}
	void giveSnacks()
	{
		System.out.println("Snacks");
	}
	public void work()
	{
		System.out.println("Work");
	}
}