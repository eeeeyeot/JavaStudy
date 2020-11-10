package day20201110;

import java.io.*;

public class PrintStar5_2442
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
				
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n + i; j++)
			{
				if(n - (i + 1) <= j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
