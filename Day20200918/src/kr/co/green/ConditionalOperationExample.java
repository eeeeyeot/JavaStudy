package kr.co.green;

public class ConditionalOperationExample
{

	public static void main(String[] args)
	{
		int score = 85;
		
		char grade = (score > 90) ? 'A' : 'B';
		
		System.out.println(score + "점은  " + grade + "입니다");
	}

}
