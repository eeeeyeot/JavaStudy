package kr.co.green;

import java.util.Scanner;

public class SwitchStringExample
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String position = input.next();
		switch(position) {
			case "부장":
				System.out.println("700");
				break;
			case "과장":
				System.out.println("500");
				break;
			default:
				System.out.println("300");
		}
		
		input.close();
	}

}
