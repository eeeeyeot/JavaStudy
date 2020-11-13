package day20201113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeAndCompositeNumber
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		for(int i = 0; i < 5; i++) {
			
			if(arr[i].equals("1"))
				System.out.println("number one");
			else if(isPrimeNumber(Integer.parseInt(arr[i])))
				System.out.println("prime number");
			else
				System.out.println("composite number");
		}
	}
	
	static boolean isPrimeNumber(int n) {
		for(int i = 2; i <= n / i; i++) {
			if(n % i == 0)
			{
				return false;		
			}
		}
		return true;
	}
}
