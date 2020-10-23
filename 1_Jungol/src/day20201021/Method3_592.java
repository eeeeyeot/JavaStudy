package day20201021;

import java.io.*;

public class Method3_592
{
	static int sum = 0;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(func(n));
	}
	
	static int func(int n) {
		if(n < 10) return sum += n * n;
		else
		{
			sum += (n % 10) * (n % 10);
			return func(n / 10);
		}
		
	}
}
