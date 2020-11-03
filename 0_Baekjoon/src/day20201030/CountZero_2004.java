package day20201030;

import java.io.*;
import java.util.StringTokenizer;

public class CountZero_2004
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		long num5 = 5, num2 = 2;
		long cnt5 = 0, cnt2 = 0;
		
		cnt5 = getTargetCount(n, num5);
		cnt2 = getTargetCount(n, num2);
		
		cnt5 -= getTargetCount(n - m, num5);
		cnt2 -= getTargetCount(n - m, num2);
		
		cnt5 -= getTargetCount(m, num5);
		cnt2 -= getTargetCount(m, num2);
		
		System.out.println(Math.min(cnt5, cnt2));
	}
	
	static long getTargetCount(long target, long num) {
		long result = 0;
		long tmp = num;
		while(target >= tmp) {
			result += target / tmp;
			tmp *= num;
		}
		
		return result;
	}
}
//nCm = n! / ((n - m)! * m!)
