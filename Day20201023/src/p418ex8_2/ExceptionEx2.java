package p418ex8_2;

public class ExceptionEx2
{
	public static void main(String[] args)
	{
		int num = 100;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
			result = num / (int)(Math.random() * 10);
			System.out.println(result);
		}
	}
}
