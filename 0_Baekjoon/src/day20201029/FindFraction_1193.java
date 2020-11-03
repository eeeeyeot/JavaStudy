package day20201029;

import java.io.*;

public class FindFraction_1193
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int prev_sum = 0, cnt = 1;
		
		while(true) {
			if(X <= prev_sum + cnt) 
			{
				//진행 방향 : 왼쪽 아래
				if(cnt % 2 == 0) 
				{
					System.out.println((X - prev_sum) + "/" + (cnt - (X - prev_sum) + 1));
					break;
				}
				//진행 방향 :오른쪽 위
				else 
				{
					System.out.println((cnt - (X - prev_sum) + 1) + "/" + (X - prev_sum));
					break;
				}
			}
			else 
			{
				prev_sum += cnt;
				cnt++;
			}
		}
	}
}