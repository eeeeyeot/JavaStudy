package kr.co.green;

public class For_Test2
{

	public static void main(String[] args)
	{
		int sum = 0;
		String exp = "";
		
		for(int i = 0; i <= 50; i++) {
			sum += i;
			exp += (i==0) ? "" + String.format("%2d", i) : "+" + String.format("%2d", i);
			if(i % 10 == 0 && i >= 10)
				exp += "\n  ";
		}
		System.out.println(exp + " = " + sum);
	}

}
