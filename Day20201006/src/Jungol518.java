import java.util.Scanner;

public class Jungol518
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		int avg = 0;
		int sum = 0;
		
		for(int i = 0; i < 3; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		
		avg = sum / num.length;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
		sc.close();
	}

}
