package day20201021;

import java.util.Scanner;

public class Method2_580
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int d = sc.nextInt();
		
		if(checkDate(m, d))
			System.out.println("OK!");
		else
			System.out.println("BAD!");
		
		sc.close();
	}
	
	static boolean checkDate(int m, int d) {
		if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 ||
				m == 10 || m == 12) {
			if(d > 31 || d < 1)
				return false;
		}else if(m == 2) {
			if(d > 29 || d < 1)
				return false;
		}else {
			if(d > 30 || d < 1)
				return false;
		}
		return true;
	}
}
