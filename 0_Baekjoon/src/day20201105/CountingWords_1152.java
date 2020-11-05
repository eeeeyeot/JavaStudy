package day20201105;

import java.io.*;

public class CountingWords_1152
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
		
		if(str.length() == 0)
			System.out.println(0);
		else
			System.out.println(str.split(" ").length);
	}
}
