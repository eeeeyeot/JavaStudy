package kr.co.green;

public class Test
{

	public static void main(String[] args)
	{
		int sum = 0;
		for(int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);
		
		/*
		 * int sum = 0, i = 0;
		 * sum += ++i;//1
		 * sum += ++i;//2
		 * sum += ++i;//3
		 * sum += ++i;//4
		 * sum += ++i;//5
		 * System.out.println("i : "+ i + "  sum : " + sum);
		 */
	}

}
