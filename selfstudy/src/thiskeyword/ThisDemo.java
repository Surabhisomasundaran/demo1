package thiskeyword;

public class ThisDemo 
{
int a;
int b;
public void demo(int a,int b)
{
	this.a=a;//assigning value a to global variable a
	this.b=b;
	
}
	public static void main(String[] args)
	{
		ThisDemo obj=new ThisDemo ();
		obj.demo(2,1);
		System.out.println(obj.a);
		System.out.println(obj.b);//instance variable
		

	}

}//this keyword is uesd wit current clss object
