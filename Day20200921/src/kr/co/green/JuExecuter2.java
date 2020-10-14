package kr.co.green;

import java.util.Scanner;

public class JuExecuter2
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("주문하세요 y/n");
		char ju = input.next().charAt(0);
		
		if(ju == 'y' || ju == 'Y') {
			System.out.println("주문 선택");
			
			int menu;
			System.out.println("1.짜장면  2.짬뽕  3.탕수육");
			menu = input.nextInt();
			
			switch(menu) {
				case 1:
					System.out.println("짜장면 선택");
					System.out.println("짜장면 곱배기 y/n");
					char gob = input.next().charAt(0);
					if(gob == 'y' || gob == 'Y') {
						System.out.println("짜장면 곱배기 선택");
					}else {
						System.out.println("짜장면 보통 선택");
					}
					break;
				case 2:
					System.out.println("짬뽕 선택");
					System.out.println("짬뽕 곱배기 y/n");
					gob = input.next().charAt(0);
					if(gob == 'y' || gob == 'Y') {
						System.out.println("짬뽕 곱배기 선택");
					}else {
						System.out.println("짬뽕 보통 선택");
					}
					break;
				case 3:
					System.out.println("탕수육 선택");
					System.out.println("1.대   2.중   3.소");
					int size = input.nextInt();
					
					switch(size) {
						case 1:
							System.out.println("탕수육 대자");
							break;
						case 2:
							System.out.println("탕수육 중자");
							break;
						case 3:
							System.out.println("탕수육 소자");
							break;
						default:
							System.out.println("잘못된 주문입니다.");
							break;
					}
					break;
				default:
					System.out.println("잘못된 입력입니다.");
					break;
			}
		}
		else {
			System.out.println("주문 취소");
		}
		
		
		input.close();
	}

}
