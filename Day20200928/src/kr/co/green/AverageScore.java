package kr.co.green;

import java.util.Scanner;

public class AverageScore
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[5];
		
		int avg = 0;
		
		for(int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
			if(scores[i] < 40)
				scores[i] = 40;
			
			avg += scores[i];
		}
		
		System.out.println(avg / scores.length);
		
		sc.close();
	}
}