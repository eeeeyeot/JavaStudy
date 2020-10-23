package day20201020;

import java.util.Scanner;

public class IF_533
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		char mf = sc.next().charAt(0);
		int age = sc.nextInt();
		
		switch(mf) {
			case 'F':
				if(age >= 18)
					System.out.println("WOMAN");
				else
					System.out.println("GIRL");
				break;
			case 'M':
				if(age >= 18)
					System.out.println("MAN");
				else
					System.out.println("BOY");
				break;
		}
		
		sc.close();
	}
}
