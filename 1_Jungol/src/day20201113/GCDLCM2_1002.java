package day20201113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCDLCM2_1002
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] inp = br.readLine().split(" ");
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(inp[i]);
		}
		int gcd, lcm;
		gcd = lcm = arr[0];
		
		for(int i = 1; i < N; i++) {
			gcd = getGCD(gcd, arr[i]);
			lcm = lcm * arr[i] / getGCD(lcm, arr[i]);
		}
		
		System.out.println(gcd + " " + lcm);
	}
	
	static int getGCD(int a, int b) {
		if(a % b == 0) return b;
		
		return getGCD(b, a % b);
	}
}