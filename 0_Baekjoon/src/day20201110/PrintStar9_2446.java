package day20201110;

import java.io.*;

public class PrintStar9_2446
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N * 2 - (i + 1); j++) {
				if(j >= i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i = 1; i < N ; i++) {
			for(int j = 0; j < N + i; j++) {
				if(j >= N - i - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
