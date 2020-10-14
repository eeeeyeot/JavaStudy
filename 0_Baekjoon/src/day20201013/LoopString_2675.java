package day20201013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopString_2675
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());

		for(int i = 0; i < t; i++) {
			String[] in	= br.readLine().split(" ");
			int	r = Integer.parseInt(in[0]);
			String[] s = in[1].split("");
			
			for(int j = 0; j < s.length; j++)
			{
				for(int k = 0; k < r; k++) {
					System.out.print(s[j]);
				}
			}
			
			System.out.println();
		}
	}
}