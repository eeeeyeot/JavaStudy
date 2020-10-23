package pptPg10;

class Parent{
	Parent(){
		System.out.println("Parent Class Constructor..");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Child Class Constructor..");
	}
}

public class ConstructorTest
{
	public static void main(String[] args)
	{
		Child c = new Child();
		
	}
}
