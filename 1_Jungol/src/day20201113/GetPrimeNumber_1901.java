package day20201113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetPrimeNumber_1901
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine().trim());
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine().trim());
			
			printNumber(arr[i]);
		}
	}
	
	static boolean isPrime(int n) {
		for(int i = 2; i <= n / i; i++) {
			if(n % i == 0)
				return false;
		}
		
		return true;
	}
	
	static void printNumber(int n) {
		if(isPrime(n))
		{
			System.out.println(n);
			return;
		}
		
		int i = 1;
		boolean isPrinted = false;
		while(!isPrinted)
		{
			if(isPrime(n - i))
			{
				System.out.print((n - i) + " ");
				isPrinted = true;
			}
			
			if(isPrime(n + i))
			{
				System.out.print(n + i);
				isPrinted = true;
			}
			
			i++;
		}
		System.out.println();
	}
}
