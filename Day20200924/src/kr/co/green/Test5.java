package kr.co.green;

import java.util.Scanner;

public class Test5
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[][] nums = new int[2][];
		
		System.out.print("num1 : ");
		nums[0] = new int[sc.nextInt()];
		System.out.print("num2 : ");
		nums[1] = new int[sc.nextInt()];
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				nums[i][j] = ++sum;
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
		
		/*int[][] scores = new int[2][3];
		
		
		
		
		 * scores[0][0] = 10;
		 * scores[0][1] = 20;
		 * scores[0][2] = 30;
		 * scores[1][0] = 40;
		 * scores[1][1] = 50;
		 * scores[1][2] = 60;
		 */		
	}

}
