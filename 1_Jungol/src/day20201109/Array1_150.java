package day20201109;

import java.io.*;

public class Array1_150
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		
		for(int i = arr.length - 1; i >= 0; i--)
			System.out.print(arr[i] + " ");
	}
}
