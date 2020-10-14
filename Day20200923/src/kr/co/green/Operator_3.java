package kr.co.green;

public class Operator_3
{

	public static void main(String[] args)
	{
		System.out.println("복합 연산자 +=");
		System.out.println("1 부터 10까지 합계");
		
		int sum = 0;
		int number = 0;
		
		for(int i = 0 ; i < 10; i++) {
			sum += ++number;
			System.out.println(String.format("%2d", sum) + " : " + String.format("%2d", number));
		}
	}
}