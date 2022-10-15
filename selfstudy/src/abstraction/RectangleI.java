package abstraction;

public class RectangleI implements Shapes
{

	public static void main(String[] args) 
	{

		RectangleI obj=new RectangleI();
		obj.colorShape();
		obj.drawShape();

	}
	@Override
	public void colorShape()
	{
		System.out.println("color shape");
	}
	
	public void drawShape()

	{
		System.out.println("draw shape");
	}

}
