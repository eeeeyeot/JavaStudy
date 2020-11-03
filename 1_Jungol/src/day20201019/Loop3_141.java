package day20201019;

import java.io.*;

public class Loop3_141
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i = 1;
		int m = 0;
		
		while(n * i < 100) {
			m = n * i++;
			System.out.print(m + " ");
			
			if(m % 10 == 0)
				break;
		}
	}
}
