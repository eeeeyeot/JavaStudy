package day20201022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String1_188
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = st.countTokens();
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i + ". " + st.nextToken());
		}
		
	}
}
