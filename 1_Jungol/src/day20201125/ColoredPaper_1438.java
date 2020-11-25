package day20201125;

import java.io.*;

public class ColoredPaper_1438
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[][] arr = new boolean[100][100];
		int T = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i = 0; i < T; i++) {
			String[] str = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);
			
			//for(int x = 0; x < n)
		}
		
		System.out.println(cnt);
	}

}
