package day20201013;

import java.util.Scanner;

public class FindAlphabet
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for(int i = 0; i < 26; i++) {
			System.out.print(findNumber(str, (char)(i + 97)) + " ");
		}
		
		sc.close();
	}
	
	static int findNumber(String str, char c) {
		String s = String.format("%c", c);
		
		if(s.contains(String.format("%c", c))) {
			String[] arr = str.split("");
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i].equals(s)) {
					return i;
				}
			}
		}
		
		return -1;
	}

}
