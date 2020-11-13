package day20201113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryNumber_2814
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = reverseString(br.readLine());
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			int n = str.charAt(i) - '0';
			if(n != 0) {
				sum += pow(2, i);
			}
		}
		
		System.out.println(sum);
		
	}
	
	static String reverseString(String s) {
		return new StringBuffer(s).reverse().toString();
	}
	
	static int pow(int a, int b) {
		if(b == 0) return 1;
		
		int result = a;
		for(int i = 1; i < b; i++) {
			result *= a;
		}
		return result;
	}
}
