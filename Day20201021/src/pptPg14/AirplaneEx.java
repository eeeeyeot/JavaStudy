package pptPg14;

public class AirplaneEx
{
	public static void main(String[] args)
	{
		SuperAirplane sa = new SuperAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperAirplane.SUPER;
		sa.fly();
		sa.flyMode = SuperAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
