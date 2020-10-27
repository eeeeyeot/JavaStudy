package day20201027;

import java.util.Scanner;

public class SnailTriangle_1337
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][];
		int cnt = 0;
		int x = -1, y = -1;
		for(int i = 0; i < n; i++) {
			arr[i] = new int[i + 1];
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				if(i % 3 == 0)
				{
					x++;
					y++;
				}
				else if(i % 3 == 1)
				{
					y--;
				}
				else if(i % 3 == 2) 
				{
					x--;
				}
				arr[x][y] = cnt++ % 10;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}