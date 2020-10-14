package day20201013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coin0_11047
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		
		int[] wons = new int[n];
		for(int i = 0; i < n; i++) {
			wons[i] = Integer.parseInt(br.readLine());
		}
		
		int cnt = 0;
		
		for(int i = wons.length - 1; i >= 0; i--) {
			if(k >= wons[i]) {
				cnt += k / wons[i];
				k %= wons[i];
			}
			
			if(k == 0)
				break;
		}
		
		
		
		System.out.println(cnt);
	}
}
