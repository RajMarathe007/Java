public class AreaOfCircle
{
	public static void main (String[] args)
	{
		int radius = 3;
		double pi = 3.14;
		
		mycode(radius,pi);
	}
	
	private static void mycode(int radius,double pi)
	{
		double area = pi*radius*radius;
		System.out.println("Area of circle is ="+area);
	}
}
