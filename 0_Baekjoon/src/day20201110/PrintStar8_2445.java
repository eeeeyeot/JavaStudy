package day20201110;

import java.io.*;

public class PrintStar8_2445
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N * 2; j++) {
				if(j <= i || (N * 2) - i - 1 <= j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i = N - 2; i >= 0; i--) {
			for(int j = 0; j < N * 2; j++) {
				if(j <= i || (N * 2) - i - 1 <= j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
