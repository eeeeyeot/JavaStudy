package day20201015;

import java.util.Scanner;

public class Average_1546
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int sum = 0;
		int score = 0;
		for(int i = 0; i < n; i++) {
			score = sc.nextInt();
			if(score > max)
				max = score;
			
			sum += score;
		}
		double avg = (double)sum / (double)max * 100 / n;
		System.out.println(avg);
		
		sc.close();
	}
}
