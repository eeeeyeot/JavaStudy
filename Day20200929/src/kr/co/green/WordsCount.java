package kr.co.green;

import java.util.Scanner;

public class WordsCount
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		if(str.length() <= 1000000) {
			String[] words = str.split(" ");
			
			
			int cnt = 0;
			for(int i = 0; i < words.length; i++) {
				if(words[i].equals("")){
					cnt++;
				}
			}
			
			
			System.out.println(words.length - cnt);
		}
		sc.close();
	}
}
