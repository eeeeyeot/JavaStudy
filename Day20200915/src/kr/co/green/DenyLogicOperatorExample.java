package kr.co.green;

public class DenyLogicOperatorExample
{

	public static void main(String[] args)
	{
		boolean play = true;
		
		System.out.println(play);
		play = !play;
		System.out.println(play);
		play = !play;
		System.out.println(play);
		
		byte v1 = 0;
		int v2 = ~v1;
		
		System.out.println(v2);
	}

}
