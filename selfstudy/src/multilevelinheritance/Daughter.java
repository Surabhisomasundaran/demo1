package multilevelinheritance;

public class Daughter extends Father {

	public static void main(String[] args) 
	{
		Daughter obj=new Daughter();
		obj.fair();
		obj.height();
		obj.weigh();
obj.hairLength();
	}
	public void hairLength()
	{
		System.out.println("long hair");
	}

}
