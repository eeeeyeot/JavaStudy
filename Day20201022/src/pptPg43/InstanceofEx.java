package pptPg43;

public class InstanceofEx
{
	public static void method1(Parent p) {
		if(p instanceof Child) {
			@SuppressWarnings("unused")
			Child c = (Child)p;
			System.out.println("method1 = Child로 변환 성공");
		}
		else {
			System.out.println("method1 = Child로 변환 실패");
		}
	}
	
	public static void method2(Parent p) {
		@SuppressWarnings("unused")
		Child c = (Child)p;
		System.out.println("method2 = Child로 변환 성공");
	}
	
	public static void main(String[] args)
	{
		Parent pA = new Child();
		method1(pA);
		method2(pA);
		System.out.println();
		
		Parent pB = new Parent();
		method1(pB);
		method2(pB);
	}
}
