package pptPg47;

public class PhoneEx
{
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		Phone phone = new SmartPhone("홍길동");
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
