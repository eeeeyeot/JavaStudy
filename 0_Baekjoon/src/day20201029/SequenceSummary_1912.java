package day20201029;

import java.io.*;
import java.util.StringTokenizer;

public class SequenceSummary_1912
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int i = 0;
		while(st.hasMoreTokens()) {
			arr[i++] = Integer.parseInt(st.nextToken());
		}
		
		int max = arr[0];
		
		for(int j = 0; j < arr.length; j++) {
			int sum = arr[j];
			for(int k = j + 1; k < arr.length; k++) {
				sum += arr[k];
				
				if(max < sum)
					max = sum;
			}
		}
		
		System.out.println(max);
	}
}
