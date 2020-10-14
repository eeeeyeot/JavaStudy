package day20201007;
import java.util.Scanner;

public class Operator113
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] square = new int[2];
		
		for(int i = 0 ; i < square.length; i++) {
			square[i] = sc.nextInt();
		}
		
		square[0] += 5;
		square[1] *= 2;
		
		System.out.println("width = " + square[0]);
		System.out.println("length = " + square[1]);
		System.out.println("area = " + (square[0] * square[1]));
		
		sc.close();
	}
}
