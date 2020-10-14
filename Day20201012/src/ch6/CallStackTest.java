package ch6;

public class CallStackTest
{
	public static void main(String[] args)
	{
		CallStackTest cst = new CallStackTest();
		cst.firstMethod();
	}
	
	void firstMethod() {
		secondMethod();
	}
	void secondMethod() {
		System.out.println("secondMethod()");
	}
}
