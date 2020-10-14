import java.util.Scanner;

public class Jungol530
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		System.out.println(age >= 20 ? "adult" : ((20 - age) + " years later"));
		
		sc.close();
	}

}
