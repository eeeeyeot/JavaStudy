package day20201203;

import java.io.*;

public class SnailSquare_1707
{
	static int[][] arr;
	static final int[][] DIRECTION = { {0, 1}, {1, 0}, {0, -1}, {-1, 0} };
	static int n;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n]; 
		
		int cnt = 1;
		int i = 0, j = 0;
		int dir = 0;
		
		while(cnt <= n * n) {
			arr[i][j] = cnt;
			
			if(!directionCheck(i, j, DIRECTION[dir][0], DIRECTION[dir][1])) 
				dir++;
			
			if(dir > 3) dir %= 4;
			
			i += DIRECTION[dir][0];
			j += DIRECTION[dir][1];

			cnt++;
		}
		
		for(int x = 0; x < arr.length; x++) {
			for(int y = 0; y < arr[x].length; y++) {
				System.out.print(arr[x][y] + " ");
			}
			System.out.println();
		}
	}
	
	static boolean directionCheck(int x, int y, int i, int j) {
		if(x + i < 0 || x + i >= n) return false;
		if(y + j < 0 || y + j >= n) return false;
		if(arr[x + i][y + j] != 0) return false;
		
		return true;
	}
}