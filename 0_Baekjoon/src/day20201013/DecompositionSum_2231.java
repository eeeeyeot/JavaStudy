package day20201013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecompositionSum_2231
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		boolean hasConstructor = false;
		int value = 0;
		for(int i = 1; i < Integer.parseInt(str); i++) {
			String[] s = String.format("%d", i).split("");
			
			int sum = i;
			for(int j = 0; j < s.length; j++) {
				sum += Integer.parseInt(s[j]);
			}
			
			if(sum == Integer.parseInt(str)) {
				hasConstructor = true;
				value = i;
				break;
			}
		}
		
		if(hasConstructor)
			System.out.println(value);
		else
			System.out.println(0);
		
	}
}
