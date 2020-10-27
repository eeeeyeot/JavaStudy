package ex9_7;

public class CloneEx1
{
	public static void main(String[] args)
	{
		Point original = new Point(3, 5);
		Point copy = (Point)original.Clone();
		System.out.println(original);
		System.out.println(copy);
		
		System.out.println(copy.equals(original));
	}
}
