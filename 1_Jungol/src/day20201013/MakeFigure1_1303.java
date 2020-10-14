package day20201013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeFigure1_1303
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		int cnt = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(cnt++ + " ");
			}
			System.out.println();
		}
		
		br.close();
	}
}
