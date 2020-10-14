package day20201007;

public class IntegerSum15596
{

	public static void main(String[] args)
	{
		
	}
	
	long sum(int[] a) {
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
}
