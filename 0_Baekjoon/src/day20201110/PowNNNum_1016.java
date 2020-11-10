package day20201110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PowNNNum_1016
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long min = Long.parseLong(st.nextToken());
		long max = Long.parseLong(st.nextToken());
		long sq = (long)Math.sqrt(max);
		int cnt = 0;
		
		int[] arr = new int[(int)sq + 1];
		for(int i = 0, j = 2; i < arr.length; i++, j++) {
			arr[i] = j * j;
		}
		
		for(long i = min; i <= max; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i % arr[j] != 0) {
					cnt++;
					break;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
