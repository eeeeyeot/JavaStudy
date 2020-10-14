package kr.co.green;

public class StringEqualsExample
{

	public static void main(String[] args)
	{
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) 
			System.out.println("reference of strVar1, strVar2 is same");
		else
			System.out.println("reference of strVar1, strVar2 is NOT same");
		
		if(strVar1.equals(strVar2))
			System.out.println("value of strVar1, strVar2 is same");
		else
			System.out.println("value of strVar1, strVar2 is NOT same");
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		if(strVar3 == strVar4)
			System.out.println("reference of strVar3, strVar4 is same");
		else
			System.out.println("reference of strVar3, strVar4 is NOT same");
		
		if(strVar3.equals(strVar4))
			System.out.println("value of strVar3, strVar4 is same");
		else
			System.out.println("value of strVar3, strVar4 is NOT same");
	}

}
