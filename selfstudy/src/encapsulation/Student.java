package encapsulation;

public class Student 
{
public static void main(String args[])
{
	School obj=new School();
	obj.setName("surabhi");
	obj.setNumber(1);
	System.out.println(obj.getName());
	System.out.println(obj.getNumber());
}

}
