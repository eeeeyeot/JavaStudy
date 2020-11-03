package day20201028;

import java.util.Scanner;

public class Array2_569
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			int sum = 0;
			for(int j = 0; j < 4; j++) {
				sum += sc.nextInt();
			}
			
			if(sum / 4 >= 80) {
				System.out.println("pass");
				cnt++;
			}
			else
				System.out.println("fail");
		}
		
		System.out.println("Successful : " + cnt);
		
		sc.close();
	}
}
