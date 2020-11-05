package day20201105;

import java.io.*;
import java.util.StringTokenizer;

public class Array1_560
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int min = Integer.MAX_VALUE;
		
		while(st.hasMoreTokens()) {
			int n = Integer.parseInt(st.nextToken());
			
			min = Math.min(n, min);
		}
		System.out.println(min);
	}
}
