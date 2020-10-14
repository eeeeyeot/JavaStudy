package day20201007;
import java.util.Scanner;

public class Array558
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[100];
		int k = 0;
		for(int i = 0 ; i < arr.length; i++) {
			int n = sc.nextInt();
			if(n == 0) break;
			arr[i] = n;
			k = i;
		}
		
		for(int i = k; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}
}
