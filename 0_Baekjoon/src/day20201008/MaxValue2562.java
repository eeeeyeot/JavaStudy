package day20201008;

import java.util.Scanner;

public class MaxValue2562
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[9];
		int[] tmp = new int[2];
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if(i == 0) {
				tmp[0] = num[i];
				tmp[1] = i;
			}
			else {
				if(tmp[0] < num[i]) {
					tmp[0] = num[i];
					tmp[1] = i;
				}
			}
		}
		
		System.out.println(tmp[0] + "\n" + (tmp[1] + 1));
		
		sc.close();
	}

}
