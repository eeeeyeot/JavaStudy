package kr.co.green;

public class StringEqualsEx
{
	public static void main(String[] args)
	{
		String	strVar1	= "JDK";
		String	strVar2	= "JDK";

		if (strVar1 == strVar2)
			System.out.println("same reference");
		else
			System.out.println("different reference");

		if (strVar1.equals(strVar2))
			System.out.println("same Value");

		System.out.println();

		String	strVar3	= new String("JDK");
		String	strVar4	= new String("JDK");

		if (strVar3 == strVar4)
			System.out.println("same reference");
		else
			System.out.println("different reference");

		if (strVar3.equals(strVar4))
			System.out.println("same Value");
	}
}
