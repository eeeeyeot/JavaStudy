package kr.co.green;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 10000000000; //에러
		long var4 = 10000000000l;
		double var5 = 100000000000000000000000000000000000d;
		
		int a = 4;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		System.out.println(var5);
		
		System.out.println((int)(var4 * a));
	}

}
