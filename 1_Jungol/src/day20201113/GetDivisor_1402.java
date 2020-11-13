package day20201113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GetDivisor_1402
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int count = 0;
		int value = 0;
		
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) {
				count++;
			}
			if(count == M) {
				value = i;
				break;
			}
		}
		
		System.out.println(value);
	}
}
