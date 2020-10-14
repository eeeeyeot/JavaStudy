package component;

public class Car2
{
	String color;
	int cc;
	
	Car2(){
		
	}
	
	Car2(String color, int cc){
		this.color = color;
		this.cc = cc;
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		Car2 myCar1 = new Car2();
		@SuppressWarnings("unused")
		Car2 myCar2 = new Car2("black", 3000);
	}
}
