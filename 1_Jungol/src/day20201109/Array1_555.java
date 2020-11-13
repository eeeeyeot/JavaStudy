package day20201109;

import java.io.*;

public class Array1_555
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		
		for(String s : arr)
			System.out.print(s);
	}
}
