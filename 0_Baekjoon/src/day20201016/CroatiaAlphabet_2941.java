package day20201016;

import java.util.Scanner;

public class CroatiaAlphabet_2941
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] str = sc.next().trim().split("");
		int cnt = 0;
		
		for(int i = 0; i < str.length; i++) {
			/*if((str[i].charAt(0) < 97 && str[i].charAt(0) > 122))
				continue;*/
			
			if(i + 1 < str.length) {
				switch(str[i] + str[i + 1]) {
					case "c=":
					case "c-":
					case "d-":
					case "lj":
					case "nj":
					case "s=":
					case "z=":
						i++;
						break;
					case "dz":
						if(i + 2 < str.length)
							if(str[i + 2].equals("=")) {
								i+=2;
							}
						break;
				}
			}
			
			cnt++;
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
}
