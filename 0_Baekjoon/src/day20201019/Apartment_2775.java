package day20201019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apartment_2775
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int[][] arr;
		for(int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			arr = new int[k + 1][n];
			
			resetArray(arr);
			setArray(arr);
			System.out.println(arr[k][n-1]);
		}
	}
	
	static void resetArray(int[][] arr) {
		for(int i = 0; i < arr[0].length;i++) {
			arr[0][i] = i + 1;
		}
	}
	
	static void setArray(int[][] arr) {
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k <= j; k++) {
						arr[i][j] += arr[i - 1][k];
				}
			}
		}
	}
	/*
	 * static void printArray(int[][] arr) {
	 * for(int i = 0; i < arr.length; i++) {
	 * for(int j = 0; j < arr[i].length; j++) {
	 * System.out.println(arr[i][j] + " ");
	 * }
	 * System.out.println();
	 * }
	 * }
	 */
}

//1(k)층 3(n)호
//if k != 0
//arr[k][n] = arr[k-1][0~n] sum





