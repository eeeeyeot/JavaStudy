package day20201008;

import java.io.*;

public class FastAplusB15552
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine().trim());
		
		for(int i = 0; i < n; i++) {
			String[] word = br.readLine().split(" ");
			
			int a = Integer.parseInt(word[0]);
			int b = Integer.parseInt(word[1]);
			bw.write((a+b) + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
