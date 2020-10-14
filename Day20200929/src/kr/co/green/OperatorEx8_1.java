package kr.co.green;

import java.util.Scanner;

public class OperatorEx8_1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int A = 0, B = 0, C = 0;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		if(A > B && A > C) {
			System.out.print("1");
		}
		else
			System.out.print("0");
		
		if(A == B && A == C) {
			System.out.print(" 1");
		}
		else
			System.out.print(" 0");
		
		sc.close();
	}
}
