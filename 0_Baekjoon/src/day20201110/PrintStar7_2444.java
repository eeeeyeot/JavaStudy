package day20201110;

import java.io.*;

public class PrintStar7_2444
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n + i; j++)
			{
				if (n - i - 1 <= j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i = n - 2; i >= 0; i--) {
			for(int j = 0; j < n + i; j++) {
				if(j >= n - 1 - i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
