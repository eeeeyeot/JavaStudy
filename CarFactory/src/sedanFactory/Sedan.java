package sedanFactory;

import component.Tire;

public class Sedan
{

	public static void main(String[] args)
	{
		Tire tire = new Tire();
		tire.setSize(10);
		
		System.out.println(tire.getSize());
	}

}
