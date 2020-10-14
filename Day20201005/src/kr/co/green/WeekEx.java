package kr.co.green;

import java.util.Calendar;

public class WeekEx
{
	enum Week
	{
		MONDAY, TUSEDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static void main(String[] args)
	{
		Week		today	= null;

		Calendar	cal		= Calendar.getInstance();

		int			iweek	= cal.get(Calendar.DAY_OF_WEEK);

		switch (iweek)
		{
			case 1:
				today = Week.SUNDAY;
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUSEDAY;
				break;
			case 4:
				today = Week.WEDNESDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SUNDAY;
				break;
		}
		
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY)
			System.out.println("오늘은 쉬는 날입니다.");
		else
			System.out.println("오늘은 공부하는 날입니다.");
	}

}
