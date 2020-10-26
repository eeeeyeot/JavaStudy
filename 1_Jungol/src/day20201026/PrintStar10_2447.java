package day20201026;

import java.io.*;

public class PrintStar10_2447
{
	static char[][] arr;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		arr = new char[N][N];
		
		fillArray(0, 0, N, false);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
	
	
	static void fillArray(int x, int y, int N, boolean blank) {
		if(blank) {
			for(int i = x; i < x + N; i++) {
				for(int j = y; j < y + N; j++) {
					arr[i][j] = ' ';
				}
			}
			
			return;
		}
		
		if(N == 1) {
			arr[x][y] = '*';
			return;
		}
		
		int size = N / 3;
		int cnt = 0;
		
		for(int i = x; i < x + N; i += size) {
			for(int j = y; j < y + N; j += size) {
				cnt++;
				
				if(cnt == 5) 
					fillArray(i, j, size, true);
				else
					fillArray(i, j, size, false);
			}
		}
	}
}
