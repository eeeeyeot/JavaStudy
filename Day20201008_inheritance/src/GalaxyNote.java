
public class GalaxyNote extends CellPhone
{
	String draw = "";
	
	GalaxyNote(String model, String color) { super(model, color); }
	
	void setDrawing(String draw){
		this.draw = draw;
	}
	
	public void drawing() {
		System.out.println("drawing " + draw);
	}
}
