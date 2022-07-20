public class PerimeterOfRect
{
	public static void main(String[] args)
	{
		int length,breadth;
		length=4;
		breadth=2;
		mycode(length,breadth);
	}
	
	private static void mycode(int length, int breadth)
	{
		int perimeter = 2*(length+breadth);
		System.out.println("Perimeter of rectangle is : "+perimeter);
	}
}
