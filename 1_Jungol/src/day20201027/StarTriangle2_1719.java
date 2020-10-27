package day20201027;

import java.util.Scanner;

public class StarTriangle2_1719
{
	public static void main(String[] args)
	{
		Scanner	sc	= new Scanner(System.in);

		int		n	= sc.nextInt();
		int		m	= sc.nextInt();

		sc.close();

		if ((n > 100 || n % 2 == 0) || (m < 1 || m > 4))
		{
			System.out.println("INPUT ERROR!");
			return;
		}

		switch (m)
		{
			case 1:
				int value = 1;
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < value; j++) {
						System.out.print("*");
					}
					System.out.println();
					if(i >= (n / 2)) value --;
					else value ++;
				}
				break;
			case 2:
				value = n / 2;
				for(int i = 0; i < n; i++) {
					for(int j = 0; j <= n / 2; j++) {
						if(j >= value)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.println();
					if(i >= (n / 2)) value ++;
					else value --;
				}
				break;
			case 3:
				value = 0;
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < n - value; j++) {
						if(j >= value)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.println();
					if(i >= (n / 2)) value--;
					else value++;
				}
				break;
			case 4:
				value = 1;
				for(int i = 0; i < n; i++) {
					if(i <= (n / 2)) {
						for(int j = 0; j <= n / 2; j++) {
							if(j >= i)
								System.out.print("*");
							else
								System.out.print(" ");
						}
					}
					else {
						for(int j = 0; j <= (n / 2) + value; j++) {
							if(j >= n / 2)
								System.out.print("*");
							else
								System.out.print(" ");
						}
						value++;
					}
					System.out.println();
				}
				break;
		}
	}
}
