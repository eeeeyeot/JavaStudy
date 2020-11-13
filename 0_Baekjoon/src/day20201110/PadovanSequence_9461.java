package day20201110;

import java.io.*;

public class PadovanSequence_9461
{
	static long[] arr = new long[101];
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		arr[4] = 2;
		arr[5] = 2;
		
		for(int i = 6; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 5];
		}
		
		for(int i = 0; i < T; i++) {
			System.out.println(arr[Integer.parseInt(br.readLine())]);
		}
	}
}
