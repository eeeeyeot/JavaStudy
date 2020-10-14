package kr.co.green;

public class For_Test1
{

	public static void main(String[] args)
	{
		int sum = 0;
		
		for(int i = 0; i <= 50; i++) {
			sum += i;
		}
		
		System.out.println("0부터 50까지의 합은 " + sum + "입니다");
	}

}
