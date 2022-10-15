package thiskeyword;

public class School
{
 String name;
 int rollNo;
	public static void main(String[] args) 
	{School obj=new School();
	obj.classes(4,"surabhi");
	System.out.println(obj.name);
	System.out.println(obj.rollNo);
		
	}
		public void classes(int rollNo,String name)
		{
			this.name=name;
			this.rollNo=rollNo;
		}
		

}
