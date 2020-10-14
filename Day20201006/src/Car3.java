
public class Car3
{
	String company = "Hyundai";
	String model;
	String color;
	int maxSpeed;
	
	Car3(){
		
	}
	
	Car3(String model){
		//this.model = model;
		this(model, "Silver", 200);
	}
	Car3(String model, String color){
		/*
		 * this.model = model;
		 * this.color = color;
		 */
		this(model, "Silver", 200);
	}
	Car3(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public static void main(String[] args)
	{
		Car3 car1 = new Car3();
		System.out.println("car1 company : " + car1.company);
		System.out.println();
		
		Car3 car2 = new Car3("Sonata");
		System.out.println("car2 company : " + car2.company);
		System.out.println("car2 model : " + car2.model);
		System.out.println();
		
		Car3 car3 = new Car3("Sonata", "Red");
		System.out.println("car3 company : " + car3.company);
		System.out.println("car3 model : " + car3.model);
		System.out.println("car3 color : " + car3.color);
		System.out.println();
		
		Car3 car4 = new Car3("Sonata", "Red", 100);
		System.out.println("car4 company : " + car4.company);
		System.out.println("car4 model : " + car4.model);
		System.out.println("car4 color : " + car4.color);
		System.out.println("car4 maxSpeed : " + car4.maxSpeed);
		System.out.println();
	}
}
