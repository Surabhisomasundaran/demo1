package multilevelinheritance;

public class Father extends Grandpa
{

	public static void main(String[] args)
	{
		Father obj=new Father();
       obj.height();
       obj.weigh();
		obj.fair();
	}
	public void fair()
	{
		System.out.println("medium fair");
	}

}
