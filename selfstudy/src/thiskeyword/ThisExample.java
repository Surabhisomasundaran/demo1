package thiskeyword;

public class ThisExample 
{
int a=2,b=5;
	public static void main(String[] args) 
	{
		ThisExample obj=new ThisExample();
		obj.localFunction();
	}
	public void localFunction()
	{
		int a=20,b=50;
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.b);
		System.out.println(this.a);
	}

}
