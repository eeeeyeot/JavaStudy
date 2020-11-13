package day20201109;

import java.io.*;

public class Array1_152
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int odd = 0;
		int even = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0)
				odd += Integer.parseInt(arr[i]);
			else
				even += Integer.parseInt(arr[i]);
		}
		
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
		
	}
}
