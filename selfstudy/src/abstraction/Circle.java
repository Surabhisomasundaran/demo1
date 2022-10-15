package abstraction;

public  class Circle extends Shape{

	public static void main(String[] args) 
	{
		Circle obj=new Circle();
		obj.cocolrShape();
		obj.drawShape();
		obj.nameShape();

	}
	@Override
	public void cocolrShape()
	{
	System.out.println("color shape");	
	}
	@Override
	
	public void nameShape()
	{
		System.out.println("name shape");	
	}

}
