package pptPg54;

public class RemoteControlEx
{
	public static void main(String[] args)
	{
		RemoteControl rc1 = new Audio();
		rc1.turnOn();
		rc1.turnOff();
		
		RemoteControl rc2 = new RemoteControl() {

			@Override
			public void turnOn()
			{
				System.out.println("RemoteControl - turnOn()");
			}

			@Override
			public void turnOff()
			{
				System.out.println("RemoteControl - turnOff()");
			}

			@Override
			public void setVolume(int volume)
			{
				
			}
		};
		
		rc2.turnOn();
		rc2.turnOff();
		
		/*
		 * RemoteControl rc;
		 * rc = new Television();
		 * rc.turnOn();
		 * rc.turnOff();
		 * rc.setVolume(11);
		 * rc.setVolume(6);
		 * rc.setVolume(-1);
		 * RemoteControl.changeBattery();
		 * rc.setMute(true);
		 * rc = new Audio();
		 * rc.turnOn();
		 * rc.turnOff();
		 * rc.setVolume(11);
		 * rc.setVolume(6);
		 * rc.setVolume(-1);
		 * rc.setMute(true);
		 */
	}
}
