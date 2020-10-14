package day20201008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APlusB4
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		
		while((str = br.readLine()) != null){
			int a = str.charAt(0) - '0';
			int b = str.charAt(2) - '0';
			
			sb.append(a+b).append("\n");
		}
		
		System.out.print(sb);
	}


	/*
	 * public static void main(String[] args)
	 * {
	 * Scanner sc = new Scanner(System.in);
	 * while(sc.hasNextInt()) {
	 * int num1 = sc.nextInt();
	 * int num2 = sc.nextInt();
	 * System.out.println(num1 + num2);
	 * }
	 * sc.close();
	 * }
	 */
}
