package component;

public class Tire
{
	private int size;
	
	public Tire() {
		System.out.println("Tire Constructor");
		size = 0;
	}
	
	public void setSize(int size) { this.size = size; }
	public int getSize() { return size; }
}
