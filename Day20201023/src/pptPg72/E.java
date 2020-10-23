package pptPg72;

public class E
{
	void method() {
		class F {
			F() {}
			int field1;
			//static int field2;
			void method1() {
				System.out.println("class E - method() - class F - method1()");
			}
			
			//static void method2() {}
		}
		
		F f = new F();
		f.field1 = 7;
		System.out.println("f.field : " + f.field1);
		f.method1();
	}
}
