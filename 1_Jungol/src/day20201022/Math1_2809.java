package day20201022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Math1_2809
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[10000];
		int cnt = 0;
		int sq = (int)Math.sqrt(N);
		
		for(int i = 1; i <= sq; i++) {
			if(N % i == 0) {
				arr[cnt++] = i;
				if((N / i) != i)
					arr[cnt++] = N / i;
			}
		}
		
		Arrays.sort(arr);
		
		for(int i = arr.length - cnt; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
