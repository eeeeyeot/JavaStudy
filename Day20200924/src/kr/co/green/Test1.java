package kr.co.green;

public class Test1
{

	public static void main(String[] args)
	{
		String[] names = {"Shin", "Hong", "Gam"};
		names[1] = "Sam";
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		/*
		 * int[] score = null;
		 * System.out.println(score);
		 */
		
		/*
		 * int[] score = new int[30];
		 * int sum = 0;
		 * for(int i = 0; i < 30; i++) {
		 * score[i] = (int)(Math.random() * 20 + 10);
		 * sum += score[i];
		 * }
		 * int avg = sum / 30;
		 * System.out.println("average : " + avg);
		 * System.out.println("sum : " + sum);
		 */
		
		/*
		 * //String hobby = null;
		 * String hobby = "travel";
		 * hobby = null;
		 */
	}

}
