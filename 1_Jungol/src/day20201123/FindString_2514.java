package day20201123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindString_2514
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int koi = 0;
		int ioi = 0;
		
		for(int i = 0; i < str.length() - 2; i++) {
			if(str.substring(i, i + 3).equals("KOI")) {
				koi++;
				i++;
			}
			else if(str.substring(i, i + 3).equals("IOI")) {
				ioi++;
				i++;
			}
		}
		
		System.out.println(koi);
		System.out.println(ioi);
	}
}
