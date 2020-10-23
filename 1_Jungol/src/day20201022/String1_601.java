package day20201022;

import java.io.*;

public class String1_601
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader	br	= new BufferedReader(new InputStreamReader(System.in));

		String			str	= br.readLine();

		for (int i = 1; i <= str.length(); i++)
		{
			System.out.print(str.substring(str.length() - i, str.length()));
			System.out.print(str.substring(0, str.length() - i));
			System.out.println();
		}
	}
}
