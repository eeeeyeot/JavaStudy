package day20201021;

import java.io.*;

public class PrimeNumber_2581
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int min = Integer.MAX_VALUE;
		int sum = 0;
		
		for(int i = m; i <= n; i++) {
			if(isPrimeNum(i)) {
				sum += i;
				if(i < min)
					min = i;
			}
		}
		
		if(sum == 0)
			System.out.println(-1);
		else
			System.out.println(sum + "\n" + min);
		
	}
	
	static boolean isPrimeNum(int num) {
		if(num == 1)
			return false;
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0)
				return false;
		}
		
		return true;
	}
}
