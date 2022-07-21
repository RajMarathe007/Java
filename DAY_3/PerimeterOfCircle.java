public class PerimeterOfCircle
{
	public static void main (String[] args)
	{
		int radius = 3;
		double pi = 3.14;
		
		mycode(radius,pi);
	}
	
	private static void mycode(int radius,double pi)
	{
		double perimeter = 2*pi*radius;
		System.out.println("Perimeter of circle is = "+perimeter);
	}
}
