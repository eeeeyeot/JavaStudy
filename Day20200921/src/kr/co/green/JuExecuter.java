package kr.co.green;

import java.util.Scanner;

public class JuExecuter
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("주문 y / n");
		char ju = sc.next().charAt(0);
		if (ju == 'y' || ju == 'Y')
		{
			System.out.println("주문 선택");
			System.out.println("1.짜장면  2.짬뽕  3.탕수육");
			int menu;
			while (true)
			{
				menu = sc.nextInt();

				if (menu > 3 || menu < 1)
				{
					System.out.println("잘못된 입력입니다 다시 입력해주세요.");
				} else
				{
					break;
				}
			}

			if (menu == 1)
			{
				System.out.println("짜장면 선택");

				System.out.println("짜장면 곱배기 선택 y/n");
				char gob = sc.next().charAt(0);

				if (gob == 'y' || gob == 'Y')
				{
					System.out.println("짜장면 곱배기");
				} else
				{
					System.out.println("짜장면 보통");
				}
			} else if (menu == 2)
			{
				System.out.println("짬뽕 선택");
				System.out.println("짬뽕 곱배기 선택 y/n");
				char gob = sc.next().charAt(0);

				if (gob == 'y' || gob == 'Y')
				{
					System.out.println("짬뽕 곱배기");
				} else
				{
					System.out.println("짬뽕 보통");
				}
			} else if (menu == 3)
			{
				System.out.println("탕수육 선택");
				System.out.println("1.소  2.중  3.대");
				int gob;
				while (true)
				{
					gob = sc.nextInt();
					if (gob > 3 || gob < 0)
					{
						System.out.println("잘못된 입력입니다. 다시 선택하세요");

					} else
					{
						break;
					}
				}
				
				if(gob == 1) {
					System.out.println("小자 선택");
				}else if(gob == 2) {
					System.out.println("中자 선택");
				}else {
					System.out.println("大자 선택");
				}
			}
		}
		/*
		 * if(ju == 'n' || ju == 'N') {
		 * System.out.println("주문 취소");
		 * }
		 */
		else
		{
			System.out.println("주문 취소");
		}
		sc.close();
	}

}
