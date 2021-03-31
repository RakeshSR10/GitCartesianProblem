public class Cartesian
{
	public static void main(String[] args)
	{
		int x1=3, x2=8, y1=5, y2=10;
		double length=Math.sqrt( ((x2-x1)^2) + ((y2-y1)^2) );
		System.out.println("Length = "+length);
	}
}
