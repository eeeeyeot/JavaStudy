package kr.co.green;
import java.util.Scanner;

public class JuExecuter1
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("주문하세요 y/n");
		char ju = input.next().charAt(0);
		if(ju == 'y'||ju == 'Y') {
			System.out.println("주문 선택");
			System.out.println("1.짜장면  2.짬뽕  3.탕수육");
			int select = input.nextInt();
			
			switch(select) {
				case 1:
					System.out.println("짜장면 선택");
					break;
				case 2:
					System.out.println("짬뽕 선택");
					break;
				case 3:
					System.out.println("탕수육 선택");
					break;
				default:
					System.out.println("주문 오류 1~3중에 선택하세요.");
					break;
			}
		}
		else {
			System.out.println("주문 취소");
		}
		
		
		
		input.close();
	}
}
