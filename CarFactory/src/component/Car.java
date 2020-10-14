package component;

public class Car
{
	String color;
	int cc;
	
	Car(String color, int cc){
		this.color = color;
		this.cc = cc;
	}
	
	public static void main(String[] args)
	{
		//Car myCar1 = new Car();

		@SuppressWarnings("unused")
		Car myCar2 = new Car("black", 3000);
	}
}
