package day20201008;

import java.util.Scanner;

public class Array561
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); 
		int[] num = new int[10];
		int[] tmp = new int[2];
		tmp[0] = -1;
		tmp[1] = 10000;
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			
			if(num[i] < 100 && num[i] > tmp[0]) {
				tmp[0] = num[i];
			}
			else if(num[i] >= 100 && num[i] < tmp[1]) {
				tmp[1] = num[i];
			}
		}
		if(tmp[0] < 0)
			tmp[0] = 100;
		if(tmp[1] >= 10000)
			tmp[1] = 100;
		
		
		System.out.println(tmp[0] + " " + tmp[1]);
		sc.close();
	}
}
