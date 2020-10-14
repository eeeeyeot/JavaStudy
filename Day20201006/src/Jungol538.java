import java.util.Scanner;

public class Jungol538
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.print("number? ");
			int n = sc.nextInt();
			if(n == 0) break;
			System.out.println(n > 0 ? "positive integer" : "negative number");
		}
	}
}
