package day20201123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadVertical_2857
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = new String[5];
		for(int i = 0; i < 5; i++) {
			arr[i] = br.readLine();
		}
		
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i].length());
		}
		
		for(int i = 0; i < max; i++) {
			for(int j = 0; j < arr.length; j++) {
				try {
					System.out.print(arr[j].charAt(i));
				}
				catch (Exception e) {
					continue;
				}
			}
		}
	}
}
