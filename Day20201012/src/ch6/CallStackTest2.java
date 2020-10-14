package ch6;

public class CallStackTest2
{
	public static void main(String[] args)
	{
		System.out.println("main start");
		firstMethod();
		System.out.println("main finish");
	}
	
	static void firstMethod() {
		System.out.println("fist start");
		secondMethod();
		System.out.println("fist finish");
	}
	static void secondMethod() {
		System.out.println("second start");
		System.out.println("second finish");
	}
}
