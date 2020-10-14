package ch6;
public class PowerTest
{
	public static void main(String[] args)
	{
		int x = 2;
		int n = 5;
		long result = 0;
		
		for(int i = 1; i <= n; i++) {
			result += power(x, i);
		}
		
		System.out.println(result);
	}
	
	static long power(int x, int i) {
		if(i == 1) return x;
		
		return x * power(x, i - 1);
	}
}
