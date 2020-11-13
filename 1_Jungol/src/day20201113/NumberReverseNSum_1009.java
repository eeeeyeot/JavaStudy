package day20201113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberReverseNSum_1009
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		
		while(!(str = br.readLine()).equals("0")) {
			int sum = 0;
			String s = "";
			for(int i = str.length() - 1; i >= 0; i--) {
				char n = str.charAt(i);
				s += n;
				sum += n - '0';
			}
			System.out.println(Integer.parseInt(s) + " " + sum);
		}
	}
}
