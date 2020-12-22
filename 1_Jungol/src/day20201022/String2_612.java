package day20201022;

import java.io.*;

public class String2_612
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		sb.append(br.readLine().replaceAll(" ", ""));
		
		for(int i = 0; i < sb.length(); i++) {
			System.out.print(sb.charAt(i));
			
			if((i + 1) % 3 == 0)
				System.out.println();
		}
	}
}
