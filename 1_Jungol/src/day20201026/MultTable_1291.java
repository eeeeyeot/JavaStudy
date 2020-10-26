package day20201026;

import java.util.Scanner;

public class MultTable_1291
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n; 
		int m;
		int value = 1;
		
		//제대로된 입력을 받을 때 까지
		while(true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if((n >= 2 && n <= 9) && (m >= 2 && m <= 9))
				break;
			System.out.println("INPUT ERROR!");
		}
		
		//첫 입력이 더 큰 경우 감소하며 출력하기 위함
		if(n > m)
			value = -1;
		
		for(int i = 1; i <= 9; i++) {
			//j != m 일 경우까지 반복하면 j가 m일 때는 출력되지 않기 떄문에 value를 더함
			for(int j = n; j != m + value; j += value) {
				System.out.printf("%d * %d = %2d   ", j, i, (j * i));
			}
			System.out.println();
		}
		
		sc.close();
	}
}
