package ex9_35;

import java.util.Scanner;

public class ScannerEx1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] argArr = null;
		
		while(true) {
			String prompt = ">>";
			System.out.print(prompt);
			
			String input = sc.nextLine().trim();
			
			argArr = input.split(" +");
			
			String command = argArr[0].trim();
			
			if("".equals(command)) continue;
			
			command = command.toLowerCase();
			
			if(command.equals("q")){
				sc.close();
				System.exit(0);
			}
			else {
				for(int i = 0; i < argArr.length; i++) {
					System.out.println(argArr[i]);
				}
			}
		}
	}
}
