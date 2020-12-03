package day20201203;

import java.io.*;
import java.util.StringTokenizer;

public class Dice_1169
{
	static int[] arr;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 1;
		}
		
		rollDice(m);
	}
	
	static void rollDice(int type) {
		boolean isFinish = true;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 6) {
				isFinish = false;
				break;
			}
		}
		if(type == 3) {
			boolean hasOverlap = false;
			for (int i = 0; i < arr.length - 1; i++)
			{
				for(int j = i + 1; j < arr.length; j++) {
					if(arr[i] == arr[j]) {
						hasOverlap = true;
						break;	
					}
				}
			}
			if(!hasOverlap) {
				for (int i = 0; i < arr.length; i++)
				{
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			}
		}
		else {
			for (int i = 0; i < arr.length; i++)
			{
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
		
		if(isFinish) return;
		
		arr[arr.length-1]++;
		
		for(int i = arr.length - 1; i > 0; i--) {
			if(arr[i] > 6) {
				arr[i - 1]++;
				if(type == 2) {
					for(int j = i; j < arr.length; j++) {
						arr[j] = arr[i - 1];
					}
				}
				else
					arr[i] = 1;
			}
		}
		
		rollDice(type);
	}
}
