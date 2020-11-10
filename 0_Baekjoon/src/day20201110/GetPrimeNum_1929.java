package day20201110;

import java.io.*;
import java.util.StringTokenizer;

public class GetPrimeNum_1929
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[1000001];
		arr[1] = 1;
		for(int i = 2; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for(int i = 2; i < arr.length; i++) {
			for(int j = i * 2; j < arr.length; j += i) {
				if(arr[j] == 0) continue;
				
				arr[j] = 0;
			}
		}
		
		for(int i = M; i <= N; i++) {
			if(arr[i] == 0 || arr[i] == 1) continue;
			
			System.out.println(arr[i]);
		}
	}
}
