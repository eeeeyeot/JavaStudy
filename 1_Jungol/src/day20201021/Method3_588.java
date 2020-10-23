package day20201021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Method3_588
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		output(N);
	}
	
	static void output(int n) {
		if(n <= 1) { 
			System.out.println(n);
			return;
		}
		
		System.out.print(n + " ");
		output(n - 1);
	}
}
