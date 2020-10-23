package day20201021;

import java.io.*;

public class Method3_591
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(func(n));
	}
	
	static int func(int n) {
		if(n <= 1)
			return 1;
		else
			return func(n/2) + func(n-1);
	}
}
