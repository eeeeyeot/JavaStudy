
public class MainClass
{
	public static void main(String[] args)
	{
		A a = new A();
		a.methodA();
		System.out.println();
		
		B b = new B();
		b.methodB();
		b.methodA();
		
	}
}

class A {
	int fieldA = 2;
	void methodA() {
		System.out.println(fieldA);
	}
}

class B extends A{
	int fieldB = 3;
	
	void methodB() {
		System.out.println(fieldB);
	}
}
