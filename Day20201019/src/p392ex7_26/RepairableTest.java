package p392ex7_26;

public class RepairableTest
{
	public static void main(String[] args)
	{
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		@SuppressWarnings("unused")
		Marine marine = new Marine();
		SCV scv = new SCV();
		scv.repair(tank);
		scv.repair(dropship);
		//scv.repair(marine);
	}
}
