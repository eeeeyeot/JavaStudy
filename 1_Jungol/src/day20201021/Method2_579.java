package day20201021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Method2_579
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		for(int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		for(int i : list) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}
}
