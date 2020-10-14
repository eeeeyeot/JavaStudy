package kr.co.green;

public class CompareOperatorExample2
{
	public static void main(String[] args)
	{
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		
		System.out.println((v4 == v5)
				+ " v4:" + String.format("%.15f", v4)
				+ " /" + " v5:" + String.format("%.15f", v5));
		System.out.println(((float)v4 == v5)
				+ " v4:" + String.format("%.15f", (float)v4)
				+ " /" + " v5:" + String.format("%.15f", v5));
		System.out.println((int)(v4 * 10) == (int)(v5 * 10));
	}
}
