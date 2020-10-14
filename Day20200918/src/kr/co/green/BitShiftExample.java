package kr.co.green;

public class BitShiftExample
{

	public static void main(String[] args)
	{
		int result = 1 << 3;
		/*
		 * System.out.println(result);
		 */
		
		result = ~4;
		//0000 0000 0000 0000 0000 0000 0000 0100
		//1111 1111 1111 1111 1111 1111 1111 1011
		System.out.println(result);
		
		result = -8 >> -3;
		//1111 1111 1111 1111 1111 1111 1111 1000
		//1111 1111 1111 1111 1111 1111 1111 1111
		System.out.println(result);
		
		result = -8 >>> 3;
		//1111 1111 1111 1111 1111 1111 1111 1000
		//0001 1111 1111 1111 1111 1111 1111 1111
		System.out.println(result);
		
	}
}