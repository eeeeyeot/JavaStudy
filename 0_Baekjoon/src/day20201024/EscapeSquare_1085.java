package day20201024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EscapeSquare_1085
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(), y = sc.nextInt();
		int w = sc.nextInt(), h = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(x);
		list.add(y);
		list.add(w - x);
		list.add(h - y);
		
		Collections.sort(list);
		
		System.out.println(list.get(0));
		
		sc.close();
	}
}
