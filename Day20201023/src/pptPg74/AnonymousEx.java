package pptPg74;

public class AnonymousEx
{
	public static void main(String[] args)
	{
		Anonymous an = new Anonymous();
		an.field.wake();
		an.method1();
		an.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			}
			
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
		
	}
}
