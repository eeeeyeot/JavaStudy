package day20201014;

import java.util.Scanner;

public class CharSquare1_1307
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int tmp;
		
		//ù ��°��� �˾Ƴ��� ���� tmp
		if(n * n > 26) 	{ tmp = (n * n) % 26; }
		else 			{ tmp = n * n; }
		
		tmp += ('A' - 1);
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				//�Ի�� n�� ��� ��ŭ ����
				int ch = (tmp - i) - (n * j);
				//A���� �۾����� �ٽ� Z����
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
