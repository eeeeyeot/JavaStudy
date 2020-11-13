package day20201113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GCDLCM_1658
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		int gcd = getGCD(num1, num2);
		int lcm = (num1 * num2) / gcd;
		System.out.println(gcd);
		System.out.println(lcm);
	}
	
	static int getGCD(int a, int b) {
		if(a % b == 0)
			return b;
		
		return getGCD(b, a % b);
	}
}
//a 1071  b 1029
//if(a % b != 0) 
// b % (a % b) == 0
// (a % b) % (b % (a % b))

