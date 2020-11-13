package day20201109;

import java.io.*;

public class Array1_562
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int even = 0;
		int odd = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			if((i + 1) % 2 == 0)
				even += Integer.parseInt(arr[i]);
			else
				odd += Integer.parseInt(arr[i]);
		}
		
		System.out.println("sum : " + even);
		System.out.printf("avg : %.1f", ((double)odd / (arr.length / 2)));
	}
}
