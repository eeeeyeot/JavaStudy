package kr.co.green;

public class Logic_Test3
{

	public static void main(String[] args)
	{
		int year = Integer.parseInt(args[0]);
		boolean isLeap = false;
		isLeap = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
		if(isLeap) {
			System.out.println(year + "년은 윤년입니다.");
			System.out.println("2월달은 29일까지 입니다.");
		}
		else {
			System.out.println(year + "년은 윤년이 아닙니다.");
			System.out.println("2월달은 28일까지 입니다.");
		}
	}

}
