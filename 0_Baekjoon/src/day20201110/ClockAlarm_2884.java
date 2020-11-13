package day20201110;

import java.io.*;
import java.util.StringTokenizer;

public class ClockAlarm_2884
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		M -= 45;
		
		if(M < 0)
		{
			H--;
			M = 60 + M;
			
			if(H < 0)
			{
				H = 23;
			}
		}
		System.out.println(H + " " + M);
	}
}
