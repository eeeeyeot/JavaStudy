package p362ex7_17;

public class InstanceofTest
{
	public static void main(String[] args)
	{
		Car fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		
		if(fe instanceof Car) {
			System.out.println("This is a Car instance.");
		}
		
		if(fe instanceof Object) {
			System.out.println("This is a Object instance.");
		}
		
		System.out.println(fe.getClass().getName());
	}
}


class Car{}

class FireEngine extends Car {}