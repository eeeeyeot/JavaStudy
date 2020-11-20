package thread;

public class ThreadTest02 {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("¶Ë");
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {
				
			}
		}
	}
}
