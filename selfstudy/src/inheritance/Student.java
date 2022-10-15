package inheritance;

public class Student extends Class
{

	public static void main(String[] args) 
	{
		Student obj=new Student();
		obj.totalStudents();
		obj.nameStudent();

	}
	public void nameStudent() 
	{
		System.out.println("Write the name of studnts");
	}

}
