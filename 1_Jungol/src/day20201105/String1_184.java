package day20201105;

import java.io.*;

public class String1_184
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().toLowerCase().split("");
		
		for(String s : arr) {
			char c = s.charAt(0);
			if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))
				System.out.print(c);
		}
	}
}
