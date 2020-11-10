package day20201109;

import java.io.*;

public class Array1_154
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		double sum = 0;
		
		for(String s : arr)
			sum += Double.parseDouble(s);
		
		System.out.printf("%.1f", sum / arr.length);
	}
}
