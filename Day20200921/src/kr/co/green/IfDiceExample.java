package kr.co.green;

public class IfDiceExample
{

	public static void main(String[] args)
	{
		int r = (int) (Math.random() * 6) + 1;

		if (r == 1)
		{
			System.out.println("1번");
		} else if (r == 2)
		{
			System.out.println("2번");
		} else if (r == 3)
		{
			System.out.println("3번");
		} else if (r == 4)
		{
			System.out.println("4번");
		} else if (r == 5)
		{
			System.out.println("5번");
		} else
		{
			System.out.println("6번");
		}
		
		//로또
		int[] num1 = new int[6];
		int tmp;
		int cnt = 0;
		for (int i = 0; i < 6; i++)
		{
			do {
				cnt++;
				tmp = (int) (Math.random() * 45) + 1;
			}while(checkNum(num1,tmp));
			num1[i] = tmp;
			System.out.print(num1[i] + " ");
		}
		System.out.println("\n연산 횟수 : " + cnt);
	}
	
	static boolean checkNum(int[] num1, int rand) {
		
		for(int i = 0; i < num1.length; i++) {
			if(num1[i] == rand) {
				return true;
			}
		}
		
		return false;
	}

}
