package day20201125;

import java.io.*;

public class ColoredPaper_1438
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[][] arr = new boolean[100][100];
		int T = Integer.parseInt(br.readLine().trim());
		int cnt = 0;

		
		for(int i = 0; i < T; i++) {
			String[] str = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0]) - 1;
			int m = Integer.parseInt(str[1]) - 1;
			
			for(int x = n; x < n + 10; x++) {
				for(int y = m; y < m + 10; y++) {
					arr[x][y] = true;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j])
					cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}