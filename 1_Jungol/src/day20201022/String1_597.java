package day20201022;

import java.io.*;

public class String1_597
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for(int i = 0; i < 2; i++)
			sum += br.readLine().length();
		
		System.out.println(sum);
	}
}
