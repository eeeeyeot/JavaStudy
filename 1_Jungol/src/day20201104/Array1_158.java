package day20201104;

import java.io.*;

public class Array1_158
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		StringBuffer sb = new StringBuffer();
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			int num = Integer.parseInt(arr[i]);
			
			if(num == 0) break;
			
			if(num % 2 == 0)
				sb.append((num / 2) + " ");
			else
				sb.append((num * 2) + " ");
			
			cnt++;
		}
		
		System.out.println(cnt);
		System.out.println(sb);
	}
}
