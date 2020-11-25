package day20201123;

import java.io.*;

public class Bowl_2604
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("");
		
		int length = 10;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i].equals(arr[i - 1]))
				length += 5;
			else
				length += 10;
		}
		
		System.out.println(length);
	}
}
