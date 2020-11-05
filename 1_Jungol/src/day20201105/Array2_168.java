package day20201105;

import java.io.*;

public class Array2_168
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N][];
		
		for(int i = 1; i <= N; i++) {
			arr[i-1] = new int[i];
		}
		
		arr[0][0] = 1;
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(j == 0)
					arr[i][j] = arr[i - 1][j];
				else if(arr[i - 1].length - 1 < j)
					arr[i][j] = arr[i-1][j-1];
				else
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
		}
		
		for(int i = arr.length - 1; i >= 0; i--) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1
//1 5 10 10 5 1
//arr[i-1][j-1] + arr[i-1][j]