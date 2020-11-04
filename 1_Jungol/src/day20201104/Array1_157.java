package day20201104;

import java.io.*;
import java.util.StringTokenizer;

public class Array1_157
{	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
 		int cnt = 0;
 		int sum = 0;
 		
 		while(st.hasMoreTokens()) {
 			int num = Integer.parseInt(st.nextToken());
 			if(num == 0) break;
 			
 			if(num % 5 == 0) {
 				cnt++;
 				sum += num;
 			}
 		}
		
 		System.out.println("Multiples of 5 : " + cnt);
 		System.out.println("sum : " + sum);
 		System.out.printf("avg : %.1f", (double)sum / cnt);
	}
}
