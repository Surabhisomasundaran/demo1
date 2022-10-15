package polymorphism;

public class Methodoverloading 
{
public static void main(String args[])
{
	int a,b;
	float x,y,z;
	Methodoverloading obj=new Methodoverloading ();
	obj.addNum(2, 3);
	obj.addNum(1.1f, 2.1f, 3.5f);
	
	
}
public void addNum(int a,int b)
{
	int c;
	c=a+b;
	System.out.println(c);
}

public void addNum(float x,float y, float z)
{
	float q;
	q=x+y+z;
	System.out.println(q);
}
}
