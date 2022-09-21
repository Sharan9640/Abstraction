abstract class Tranner 
{
	abstract public void sharan();
	abstract public void cherry();
}
class player extends Tranner
{
	public void sharan()
	{
		System.ouyt.println("Run");
	}
	public void cherry()
	{
		System.out.println("walk");
	}
}
class Mainclass
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		new.Player().sharan();
		new.Player().cherry();
		System.out.println("main ends");
	}
}
