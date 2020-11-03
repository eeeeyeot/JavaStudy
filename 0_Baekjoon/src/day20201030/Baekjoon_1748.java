package day20201030;

import java.io.*;

public class Baekjoon_1748
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		int n = Integer.parseInt(N);
		
		int result = 0;
		int tmp = 9;
		
		for(int i = 1; i < N.length(); i++) {
			result += i * tmp;
			tmp *= 10;
		}
		
		int last = (int)(n - Math.pow(10, N.length() - 1) + 1) * N.length();
		result += last;
		
		System.out.println(result);
		
	}
}
