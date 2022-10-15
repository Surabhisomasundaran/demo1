
public class Child implements Father,Mother 
{

	public static void main(String[] args) 
	{
	Child obj=new Child();	
obj.height();
obj.weight();
	}
	public void height() 
	{
	System.out.println("taller");	
	}
	public void weight()
	{
		System.out.println("slim");	
	}

}
