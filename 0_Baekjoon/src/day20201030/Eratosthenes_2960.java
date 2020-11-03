package day20201030;

import java.io.*;
import java.util.StringTokenizer;

public class Eratosthenes_2960
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N + 1];
		
		arr[0] = 0;
		for(int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for(int i = 2; i < arr.length; i++) {
			for(int j = i * 2; j < arr.length; j += i) {
				arr[j] = 0;
			}
		}
		
		int cnt = 0;
		int num = 0;
		boolean isOver = false;
		while(!isOver) {
			for(int i = 2; i <= N; i++) {
				if(arr[i] == 0) continue;
				
				for(int j = i; j <= N; j += i) {
					if(arr[j] == -1) continue;
					num = j;
					arr[j] = - 1;
					if(++cnt >= K) {
						isOver = true;
						break;
					}
				}
				
				if(isOver) {
					break;
				}
			}
		}
		System.out.println(num);
	}
}