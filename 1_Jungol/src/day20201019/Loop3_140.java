package day20201019;

import java.util.Scanner;

public class Loop3_140
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;
		
		for(int i = 0; i < 20; i++) {
			int n = sc.nextInt();
			sum += n;
			if(n != 0)
				cnt++;
			else
				break;
		}
		
		System.out.println(sum + " " + (sum / cnt));
		
		sc.close();
	}
}
