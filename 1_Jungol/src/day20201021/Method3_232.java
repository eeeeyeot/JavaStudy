package day20201021;

import java.io.*;

public class Method3_232
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		func(n);
	}
	
	static void func(int n) {
		if(n - 2 <= 0) {
			System.out.print(n + " ");
		}
		else {
			func(n - 2);
			System.out.print(n + " ");
		}
	}
}
