public class Cartesian
{
	public static void main(String[] args)
	{
		int x1=3, x2=8, y1=5, y2=10;
		int x3=3, x4=8, y3=5, y4=10;


		double length=Math.sqrt( ((x2-x1)^2) + ((y2-y1)^2) );
		System.out.println("Length = "+length);

		double length1=Math.sqrt( ((x4-x3)^2) + ((y4-y3)^2) );
                System.out.println("Length = "+length1);

		if(length == length1)
			System.out.println("Both lines are Equal");
		else
			System.out.println("Not equal");


		String s1=String.valueOf(length);
		String s2=String.valueOf(length1);
		System.out.println("Result of Two lengths = "+s1.compareTo(s2));

	}
}
