package day20201021;

import java.io.*;
import java.util.StringTokenizer;

public class Method3_236
{
	static int mult = 1;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			n *= Integer.parseInt(st.nextToken());
		}
		System.out.println(func(n));
	}
	
	static int func(int n) {
		if(n < 10) {
			if(n == 0) return mult;
			return mult *= n;
		}
		
		if(n % 10 != 0)
			mult *= n % 10;
		
		
		return func(n / 10);
	}
}
