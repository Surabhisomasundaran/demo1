package polymorphism;

public class Child extends Parent {

	public static void main(String[] args)
	{
		Child obj=new Child();
		obj.eat();
		
	}
	public void eat()
	{
		System.out.println("eat non vegetabe");
		super.eat();
	}
}
