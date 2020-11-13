package day20201109;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Array1_563
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer[] arr = new Integer[10];
		String[] sArr = br.readLine().split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sArr[i]);
		}
		
		Arrays.sort(arr, Comparator.reverseOrder());
		
		for(int i : arr)
			System.out.print(i + " ");
	}
}
