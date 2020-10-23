package day20201019;

import java.util.Scanner;

public class Loop_129
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char isLoop;
		do {
			System.out.print("Base = ");
			int base = sc.nextInt();
			System.out.print("Height = ");
			int height = sc.nextInt();
			System.out.println("Triangle width = " + ((double)base * height / 2));
			
			System.out.print("Continue? ");
			isLoop = sc.next().charAt(0);
			
		}while(isLoop == 'Y' || isLoop == 'y');
		
		sc.close();
	}
}
