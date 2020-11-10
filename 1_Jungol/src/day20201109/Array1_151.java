package day20201109;

import java.io.*;

public class Array1_151
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] arr = br.readLine().split(" ");
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0)
				sum += Integer.parseInt(arr[i]);
		}
		
		System.out.println(sum);
	}
}
