package ex9_36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx2
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File(
				"D:\\0_Java 디지털컨버전스\\workspaceJAVA\\Day20201029\\src\\ex9_36\\data2.txt"));
		int sum = 0;
		int cnt = 0;
		
		while(sc.hasNextInt()) {
			int n = sc.nextInt();
			System.out.println(n);
			sum += n;
			cnt++;
		}
		
		System.out.println("sum = " + sum);
		System.out.println("average = " + (double)sum / cnt);
		
		
		sc.close();
	}
}
