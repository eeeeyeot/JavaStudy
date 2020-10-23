package pptPg11;

class Parent {
	public String name;
	public String ssn;
	
	Parent(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
}

class Child extends Parent {
	public int ChildNo;
	
	Child(String name, String ssn, int childNo){
		super(name, ssn);
		this.ChildNo = childNo;
	}
}

public class ConstructorTest2
{
	public static void main(String[] args)
	{
		Child c = new Child("홍길동", "123456-1234567", 1);
		System.out.println("name : " + c.name);
		System.out.println("ssn : " + c.ssn);
		System.out.println("childNo : " + c.ChildNo);
	}
}
