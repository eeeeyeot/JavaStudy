package kr.co.green;

public class Operator_2
{
	public static void main(String[] args)
	{
		/*
		 * System.out.println("논리연산자 && 0부터 9사이의 숫자의 범위 설정");
		 * int logic1 = 5;
		 * int logic2 = 10;
		 * String result = "";
		 * result = (logic1 > 0 && logic2 < 9) ? "0부터 9사이의 범위입니다." :
		 * "0부터 9사이의 범위가 아닙니다.";
		 * System.out.println(result);
		 */
		
		System.out.println("논리연산자 || 대문자와 소문자 비교");
		char logic1 = 'A';
		String result = "";
		result = (logic1 > 'A' || logic1 < 'a') ? "대문자 A와 소문자 a같다" : "대문자 A와 소문자 a가 아니다";
		System.out.println(result);
	}
}
