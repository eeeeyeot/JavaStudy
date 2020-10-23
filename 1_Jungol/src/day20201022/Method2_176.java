package day20201022;

import java.io.*;
import java.util.StringTokenizer;

public class Method2_176
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		int cnt = 0;
		
		if(a > b) {
			double tmp = a;
			a = b;
			b = tmp;
		}
		
		for(int i = 0; i * i <= b; i++) {
			if(i * i >= a && i * i <= b) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
