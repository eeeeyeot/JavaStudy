package day20201104;

import java.io.*;
import java.util.StringTokenizer;

public class Array1_156
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 999) break;
			
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
