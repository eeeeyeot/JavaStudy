package kr.co.green;

import java.text.DecimalFormat;

public class Switch_Test1
{

	public static void main(String[] args)
	{
		DecimalFormat formatter = new DecimalFormat("###,###");
		
		String job = args[0];
		int salary = 0;
		switch(job) {
			case "사원":
				salary = 20000000;
				//break;
			case "대리":
				salary = 35000000;
				//break;
			case "과장":
				salary = 50000000;
				//break;
			case "부장":
				salary = 80000000;
				//break;
			default:
				break;
		}
		System.out.println("당신의 연봉은 " + formatter.format(salary) + "원입니다.");
	}

}
