
public class CellPhone
{
	String model;
	String color;
	
	CellPhone(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("Power On");
	}
	
	void powerOff() {
		System.out.println("Power Off");
	}
	
	void bell() {
		System.out.println("Bell ring");
	}
	
	void sendVoice(String msg) {
		System.out.println("Send Message : " + msg);
	}
	
	void receiveVoice(String msg) {
		System.out.println("Send Message : " + msg);
	}
	
	void hangUp() {
		System.out.println("Hang Up");
	}
	
}
