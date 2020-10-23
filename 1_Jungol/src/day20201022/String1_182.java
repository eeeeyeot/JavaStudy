package day20201022;

import java.io.*;
import java.util.StringTokenizer;

public class String1_182
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader	br	= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		char c1 = st.nextToken().charAt(0);
		char c2 = st.nextToken().charAt(0);
		
		System.out.print(c1 + c2 + " ");
		System.out.print(Math.abs(c1 - c2));
	}
}
