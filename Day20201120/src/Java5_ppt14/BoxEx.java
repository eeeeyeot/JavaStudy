package Java5_ppt14;

public class BoxEx {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Box box = new Box();
		
		box.set("ȫ�浿");
		String name = (String)box.get();
		System.out.println(name);
		
		box.set(new Apple());
		Apple apple = (Apple)box.get();
	}
}

class Box {
	private Object obj;
	
	public void set(Object obj) {
		this.obj = obj;
	}
	
	public Object get() {
		return obj;
	}
}

class Apple {
	
}