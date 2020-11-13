package day20201113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DecimalTo2816_1534
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println(hexConverter(str, B));
	}
	
	static String hexConverter(String str, int b)
	{
		StringBuffer result = new StringBuffer();
		int num = Integer.parseInt(str);
		while(num != 0) {
			int remain = num % b < 10 ? num % b : (num % b) % 10 + 'A';
			
			num /= b;
			
			if(remain < 10)
				result.append(remain);
			else
				result.append((char)remain);
		}
		
		return reverseString(result.toString());
	}
	
	static String reverseString(String s) {
		return new StringBuffer(s).reverse().toString();
	}
}
