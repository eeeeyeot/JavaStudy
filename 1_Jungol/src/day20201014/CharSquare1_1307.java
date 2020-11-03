package day20201014;

import java.util.Scanner;

public class CharSquare1_1307
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int tmp;
		
		//첫 출력값을 알아내기 위한 tmp
		if(n * n > 26) 	{ tmp = (n * n) % 26; }
		else 			{ tmp = n * n; }
		
		tmp += ('A' - 1);
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				//게산식 n의 배수 만큼 감소
				int ch = (tmp - i) - (n * j);
				//A보다 작아지면 다시 Z부터
				if(ch < 'A')
					ch = 'Z' - ('A' - ch) + 1;
				
				System.out.print((char)ch + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
//4
//80 76 72 68
//79 75 71 67
//78 74 70 66
//77 73 69 65
