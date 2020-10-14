package day20201012;

import java.util.Scanner;

public class SelectControl_632
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[3];
		
		int tmp = 0;
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if(i == 0)
				tmp = num[i];
			else if(num[i] < tmp) {
				tmp = num[i];
			}
		}
		System.out.println(tmp);
		
		sc.close();
	}

}
