package kr.co.green;

import java.util.Scanner;

public class ArrayQuiz557
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		char[] arr = new char[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next().charAt(0);
			
			if(i == 0 || i == 3 || i == 6) {
				System.out.print(arr[i] + " ");
			}
		}
		
		sc.close();
	}

}
