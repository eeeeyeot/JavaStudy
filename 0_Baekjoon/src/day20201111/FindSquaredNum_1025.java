package day20201111;

import java.io.*;

public class FindSquaredNum_1025
{
	static int result = -1;
	static int[][] arr;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		arr = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			for(int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			findSquare(i);
		}
		System.out.println(result);
	}
	
	static void findSquare(int n) throws IOException
	{
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < arr[n].length; i++) {
			for(int j = 0; j < arr[n].length; j++) {
				if(i == j) continue;
				
				sb.append(arr[n][i]).append(arr[n][j]);
				int tmp = Integer.parseInt(sb.toString());
				if((int)Math.sqrt(tmp) == Math.sqrt(tmp))
				{
					if(result < tmp)
						result = tmp;
				}
				sb.setLength(0);
			}
		}
	}
}
