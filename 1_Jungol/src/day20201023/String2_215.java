package day20201023;

import java.util.Scanner;

public class String2_215
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[2];
		
		int[] num = new int[2];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
			
			
			for(int j = 0; j < arr[i].length(); j++) {
				if(j == arr[i].length() - 1 && 
						(arr[i].charAt(j) >= '0' && arr[i].charAt(j) <= '9')) {
					arr[i] = arr[i].substring(0, j + 1);
				}
				else if((arr[i].charAt(j) < '0' || arr[i].charAt(j) > '9')) 
				{
					arr[i] = arr[i].substring(0, j);
					break;
				}
			}
			
			num[i] = Integer.parseInt(arr[i]);
		}
		System.out.println(num[0] * num[1]);
		
		sc.close();
	}
}
