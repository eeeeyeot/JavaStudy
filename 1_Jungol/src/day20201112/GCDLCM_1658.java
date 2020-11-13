package day20201112;

import java.util.Scanner;

public class GCDLCM_1658
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int gcd = get_gcd(a, b);
		int lcm = a * b / gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);
		
		sc.close();
	}

	static int get_gcd(int x, int y) {
		int ans = 0;
		for(int i = 1; i<= x; i++) {
			if(x % i == 0 && y % i == 0) {
				ans = i;
			}
		}
		
		return ans;
	}
}
// a * b == lcm * gcd
//: a * b / gcd == lcm