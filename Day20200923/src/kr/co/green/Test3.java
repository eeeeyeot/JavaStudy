package kr.co.green;

public class Test3
{

	public static void main(String[] args)
	{
		for(int i = 0; i < 5; i++) {
			if(i == 2)
				continue;
			System.out.println(i);
		}
		
		/*
		 * int i = 0;
		 * while(!(i == 6)) {
		 * System.out.println("그린");
		 * if(i++ >= 3)
		 * continue;
		 * System.out.println("학원");
		 * }
		 */
	}

}
