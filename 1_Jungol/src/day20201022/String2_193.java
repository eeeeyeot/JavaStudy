package day20201022;

import java.util.Scanner;

public class String2_193
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[5];
		String c;
		String s;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		
		c = sc.next();
		s = sc.next();
		
		boolean hasValue = false;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].contains(c) || arr[i].contains(s)) {
				hasValue = true;
				System.out.println(arr[i]);
			}
		}
		
		if(!hasValue)
			System.out.println("none");
		
		sc.close();
	}
}
