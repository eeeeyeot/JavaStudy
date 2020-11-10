package day20201110;

import java.io.*;

public class PrintStar6_2443
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = n - 1; i >= 0; i--) {
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
