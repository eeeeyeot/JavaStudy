package kr.co.green;

import java.util.Scanner;

public class SevenDwarfs
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] num = new int[9];
		
		for(int i = 0; i < 9; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		
		int num1 = 0, num2 = 0;
		
		for(int i = 0; i < num.length; i++) {
			for(int j = i + 1; j < num.length; j++) {
				if(sum - (num[i] + num[j]) == 100) {
					num1 = num[i];
					num2 = num[j];
					
					break;
				}
			}
			
			if(num1 != 0 || num2 != 0)
				break;
		}
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] != num1 && num[i] != num2)
				System.out.println(num[i]);
		}
		
		sc.close();
	}
}
