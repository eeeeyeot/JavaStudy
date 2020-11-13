package day20201113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountPrime_2813
{
	static int[] arr = new int[2000001];
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		
		setArray(arr);
		
		for(int i = M; i <= N; i++) {
			cnt += isPrime(i);
		}
		
		System.out.println(cnt);
	}
	
	static void setArray(int[] arr) {
		arr[0] = arr[1] = 1;
		for(int i = 2; i < arr.length; i++) {
			for(int j = i * 2; j < arr.length; j += i) {
				arr[j] = 1;
			}
		}
	}
	
	static int isPrime(int n) {
		if(arr[n] != 0) return 0;
		
		return 1;
	}
}
