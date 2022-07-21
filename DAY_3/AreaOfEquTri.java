import java.lang.Math;
public class AreaOfEquTri
{
	public static void main(String[] args)
	{
		int a = 5;
		mycode(a);
		
	}
	private static void mycode(int a)
	{
		double area = (Math.sqrt(3)/4) * a * a;
		System.out.println("Area of a Equilateral Triangle is : "+area);
	}
}
