package kr.co.green;

public class BreakExample
{

	public static void main(String[] args)
	{
		int i = 0;
		double a = 5f / 6f;
		double b = 1;
		while(true) {
			int num = (int) (Math.random() * 6) + 1;
			b *= a;
			
			System.out.println((num + "  " + String.format("%2d", ++i) + "번 "
				+ String.format("%.6f", b * 100)) );
			
			if(num == 6) {
				break;
			}
		}
		
		System.out.println("프로그램종료");
	}

}
