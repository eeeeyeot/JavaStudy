package kr.co.green;

public class Test2
{

	public static void main(String[] args)
	{
		green:for(int i = 0; i < 2; i ++) {
			for(int j = 0 ; j < 2; j++) {
				if(i == 1) {
					break green;
				}
				System.out.println(i + " : " + j);
			}
		}
	}

}
