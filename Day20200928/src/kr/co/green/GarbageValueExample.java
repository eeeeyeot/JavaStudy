package kr.co.green;

public class GarbageValueExample
{

	public static void main(String[] args)
	{
		byte var1 = 125;
		byte var2 = 125;
		
		for(int i = 0; i < 5; i++) {
			var1++;
			var2++;
			
			System.out.println("var1 : " + String.format("%4d", var1)
				+ "\tvar2 : " + String.format("%4d", var2));
		}
	}

}
