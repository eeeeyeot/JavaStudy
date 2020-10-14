package kr.co.green;

public class ForPrintFromTo10Example
{
	public static void main(String[] args)
	{
		for(int i = 0, j = 100; i <= 50 && j >= 50; i++,j--) {
			System.out.println("i : " + String.format("%2d", i) + "  j : " + j);
		}
		
		/*
		 * int i = 1;
		 * for(; i<=100; i++) {
		 * System.out.println(String.format("%3d", i));
		 * }
		 */
		
		/*
		 * for(int i = 1; i <= 10; i++) {
		 * System.out.println(String.format("%2d", i));
		 * }
		 */
		
	}
}
