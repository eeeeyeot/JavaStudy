package day20201007;

import java.io.*;

public class DistributeProcess_1009
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int a, b;
		for(int i = 0; i < T; i++) {
			String[] s = br.readLine().split(" ");
			a = Integer.parseInt(s[0]);
			b = Integer.parseInt(s[1]);
			
			int result = 1;
			for(int j = 0; j < b; j++)
				result = (result % 10) * a;
			
			result %= 10;
			System.out.println(result == 0 ? 10 : result);
		}
	}
}