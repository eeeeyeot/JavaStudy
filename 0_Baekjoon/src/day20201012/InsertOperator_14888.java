package day20201012;

import java.util.Scanner;

public class InsertOperator_14888
{
	static int	cal[], check[];
	static int	n;
	static int	max	= Integer.MIN_VALUE, min = Integer.MAX_VALUE;

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		check = new int[n];
		cal = new int[4];
		
		for(int i = 0; i < check.length; i++) {
			check[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 4; i++) {
			cal[i] = sc.nextInt();
		}
		
		dfs(check[0], 1);
		
		System.out.println(max + "\n" + min);
		
		sc.close();

	}

	static void dfs(int num, int idx)
	{
		if (idx == n)
		{
			if (num > max)
				max = num;
			if (num < min)
				min = num;
			return;
		}

		int result = 0;

		for (int i = 0; i < 4; i++)
		{
			if (cal[i] != 0)
			{
				cal[i]--;

				switch (i)
				{
					case 0:
						result = num + check[idx];	
						break;
					case 1:
						result = num - check[idx];
						break;
					case 2:
						result = num * check[idx];
						break;
					case 3:
						if(num < 0 && check[idx] > 0) {
							num *= -1;
							result = num / check[idx];
							result *= -1;
						}
						else {
							result = num / check[idx];
						
							break;
						}
				}
				dfs(result, idx + 1);
				cal[i]++;
			}
		}
	}
}
