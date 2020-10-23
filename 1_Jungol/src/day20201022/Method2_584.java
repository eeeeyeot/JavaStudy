package day20201022;

public class Method2_584
{
	static final int ONE = 1;
	static final int TWO = 2;
	static final int THREE = 3;
	
	
	public static void main(String[] args)
	{
		for(int i = ONE; i <= THREE; i++) {
			for(int j = ONE; j <= THREE; j++) {
				System.out.println(i + " + " + j + " = " + (i+j));
			}
		}
	}
}
