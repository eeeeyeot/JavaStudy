package day20201030;

import java.io.*;
import java.math.BigInteger;

public class BinNumToOctNum_1373
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String oct = (new BigInteger(br.readLine(), 2)).toString(8);
		
		System.out.println(oct);
	}
}
