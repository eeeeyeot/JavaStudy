package kr.co.green;

import java.util.Scanner;

public class LessThenX
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[sc.nextInt()];
		int x = sc.nextInt();
		
		for(int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
			
			if(n[i] < x) {
				System.out.print(n[i] + " ");
			}
		}
		
		sc.close();
	}
}
