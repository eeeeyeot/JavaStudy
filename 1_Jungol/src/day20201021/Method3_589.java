package day20201021;

import java.io.*;

public class Method3_589
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		System.out.println(sumMethod(N));
		
		
	}
	
	static int sumMethod(int n) {
		if(n <= 1) {
			return 1;
		}
		else {
			return n + sumMethod(n - 1);
		}
	}
}
