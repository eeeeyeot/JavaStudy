package kr.co.green;

import java.util.ArrayList;
import java.util.Scanner;

public class HaksaProject
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		ArrayList<Human> h = new ArrayList<Human>();
		
		while (true)
		{
			System.out.println("========= 메뉴 선택 ==========");
			System.out.println("1. 등록\n2. 찾기\n3. 삭제\n4. 전체 출력");
			System.out.println("----------------");
			System.out.println("0. 종료");
			System.out.println("----------------");
			System.out.print("번호를 선택해 주세요..");

			int num = input.nextInt();
			switch (num)
			{
				case 1://등록
					System.out.println("========= 등록 ==========");
					System.out.println("1. 학생\n2. 교수\n3. 관리자\n4. 이전 메뉴");
					System.out.print("번호를 선택해 주세요..");
					int menu = input.nextInt();
					if (menu == 1)	//학생
					{
						Student s = new Student();
						System.out.print("나이 : ");
						int age = input.nextInt();
						s.age = age;
						System.out.print("이름 : ");
						String name = input.next();
						s.name = name;
						System.out.print("학번 : ");
						int gradeNum = input.nextInt();
						s.gradeNum = gradeNum;
						
						h.add(s);
					} else if (menu == 2)	//교수
					{
						
					} else if (menu == 3)	//관리자
					{
						
					} else if (menu == 4)	//이전 메뉴
					{
						continue;
					}
					break;
				case 2://찾기

					break;
				case 3://삭제

					break;
				case 4://전체 출력

					break;
				case 0://종료
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					break;
				default:
					break;
			}
		}
	}
	
	abstract static class Human{
		int age;
		String name;
	}
	
	static class Student extends Human{
		int gradeNum;
	}
	static class Professor extends Human{
		String _class; 
	}
	static class Manager extends Human{
		String department;
	}
}
