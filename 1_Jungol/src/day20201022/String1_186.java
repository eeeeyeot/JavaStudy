package day20201022;

import java.util.Scanner;
import java.util.StringTokenizer;

public class String1_186
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		int length1 = st.nextToken().length();
		int length2 = st.nextToken().length();
		
		System.out.println((length1 > length2) ? length1 : length2);
		
		sc.close();
	}
}
