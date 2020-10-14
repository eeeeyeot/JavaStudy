package day20201008;

import java.util.Scanner;

public class SugarDelivery2839
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int count = 0;
		
		while(true) {
			if(input % 5 == 0) {
				System.out.println(input / 5 + count);
				break;
			}
			else if(input < 0) {
				System.out.println(-1);
				break;
			}
			else {
				input -= 3;
				count++;
			}
		}
		
		sc.close();
		
	}

}
