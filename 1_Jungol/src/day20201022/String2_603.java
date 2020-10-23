package day20201022;

import java.io.*;
import java.util.StringTokenizer;

public class String2_603
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader	br	= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = st.countTokens();
		
		for(int i = 1; i <= n;i++) {
			String str = st.nextToken();
			if(i % 2 != 0)
				System.out.println(str);
		}
	}
}
