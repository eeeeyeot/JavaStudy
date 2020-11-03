package ex9_37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx3
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File(
				"D:\\0_Java 디지털컨버전스\\workspaceJAVA\\Day20201029\\src\\ex9_37\\data3.txt"));
		
		int cnt = 0;
		int totalSum = 0;
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(",");
			int sum = 0;
			
			while(sc2.hasNextInt()) {
				sum += sc2.nextInt();
			}
			System.out.println(line + ", sum = " + sum);
			totalSum += sum;
			cnt++;
		}
		System.out.println("Line : " + cnt + ", Total : " + totalSum);
		
		sc.close();
	}
}
