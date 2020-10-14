package kr.co.green;

public class Logic_Test4
{

	public static void main(String[] args)
	{
		int age = Integer.parseInt(args[0]);
		String logic_result = "";
		if(age / 10 == 0)
			logic_result = "10대 이하";
		else if(age / 10 == 1)
			logic_result = "10대";
		else if(age / 10 == 2)
			logic_result = "20대";
		else if(age / 10 == 3)
			logic_result = "30대";
		else if(age / 10 == 4)
			logic_result = "40대";
		else if(age / 10 == 5)
			logic_result = "50대";
		else if(age / 10 >= 6)
			logic_result = "60대 이상";
		else
			logic_result = "사람이 아니다.";
		
		System.out.println("당신은 " + logic_result + "입니다.");
	}

}
