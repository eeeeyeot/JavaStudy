package day20201008;

import java.io.*;

public class BreakEvenPoint_1712
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int C = Integer.parseInt(str[2]);
		int result;
		
		if(C <= B) result = -1;
		else result = A / (C - B) + 1;
		
		System.out.println(result);
	}
}
