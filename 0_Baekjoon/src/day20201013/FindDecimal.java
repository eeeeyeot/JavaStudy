package day20201013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDecimal
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] numbers = new int[n];
		String[] str = br.readLine().split(" ");
		
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(str[i]);
			if (numbers[i] != 1)
			{
				boolean isDec = true;
				for (int j = 2; j < numbers[i]; j++)
				{
					if (numbers[i] % j == 0)
						isDec = false;
				}

				if (isDec)
				{
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
