package day20201021;

import java.io.*;

public class Method3_235
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		func(n, cnt);
	}
	
	static void func(int n, int cnt) {
		if(n == 1) {
			System.out.println(cnt);
			return;
		}
		
		if(n % 2 != 0) {
			func(n / 3, cnt + 1);
		}else {
			func(n / 2, cnt + 1);
		}
	}
}
