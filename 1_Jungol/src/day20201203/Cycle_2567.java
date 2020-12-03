package day20201203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cycle_2567
{
	static int N;
	static int P;
	static int[] arr = new int[100];
	static int cnt = 0;
	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        
        cycle((N * N) % P);
        
        System.out.println(cnt);
	}
	
	static void cycle(int remain) {
		arr[remain]++;
		if(arr[remain] > 1) return;
		cnt++;
		
		cycle((remain * N) % P);
	}
}
