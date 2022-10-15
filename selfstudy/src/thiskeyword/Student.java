package thiskeyword;

public class Student 
{
String name;
int rollno;

public void setVale(String name,int rollno)
{
	this.name=name;
	this.rollno=rollno;
	
}
	public static void main(String[] args) 
	{
		Student obj=new Student();
		obj.setVale("surabhi", 4);
		System.out.println(obj.name);
		System.out.println(obj.rollno);
	}

}
