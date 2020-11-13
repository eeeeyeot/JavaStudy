package day20201022;

import java.io.*;

public class String1_187
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer str = new StringBuffer(br.readLine());
		
		while(str.length() > 1) {
			int n = Integer.parseInt(br.readLine());
			if(n > str.length())
				n = str.length();
			
			str.deleteCharAt(n - 1);
			System.out.println(str);
		}
	}
}
