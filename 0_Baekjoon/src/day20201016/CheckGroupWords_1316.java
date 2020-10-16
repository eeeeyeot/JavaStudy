package day20201016;

import java.util.Scanner;

public class CheckGroupWords_1316
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char[] arr = new char[26];
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			String[] str = sc.next().trim().split("");
			boolean isGroup = true;
			for(int j = 0; j < str.length; j++) {
				if(arr[str[j].charAt(0) - 'a'] == 0)
					arr[str[j].charAt(0) - 'a'] = (char)(j + 1);
				else if((j + 1) - arr[str[j].charAt(0) - 'a'] > 1)
				{
					isGroup = false;
					break;
				}
				else {
					arr[str[j].charAt(0) - 'a'] = (char)(j + 1);
				}
					
			}
			
			if(isGroup)
				cnt++;
			
			clearArray(arr);
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
	
	static void clearArray(char[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
	}
}
