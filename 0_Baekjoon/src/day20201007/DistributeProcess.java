package day20201007;

import java.util.Scanner;

public class DistributeProcess
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[sc.nextInt()][2];
		int[] processAmount = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				
				if(j == 0)
					processAmount[i] = arr[i][j];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i][1] - 1; j++) {
				processAmount[i] *= arr[i][0];
				
				if(processAmount[i] > 10)
					processAmount[i] %= 10;
			}
		}
		
		for(int i = 0; i < processAmount.length; i++) {
			System.out.println(processAmount[i]);
		}
		
		
		
		sc.close();
	}

}
