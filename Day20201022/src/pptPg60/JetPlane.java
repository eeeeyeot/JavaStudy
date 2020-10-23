package pptPg60;

public class JetPlane extends Plane implements Flyable, Soundable
{

	@Override
	public void sound()
	{
		System.out.println("제트기 소리 : 슈우웅");
	}

	@Override
	public void fly()
	{
		System.out.println("제트기가 날아갑니다.");
	}
}
