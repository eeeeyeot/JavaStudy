package Java5_ppt10;

public class ThreadEx {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� : " + mainThread.getName());
		
		ThreadA thA = new ThreadA();
		System.out.println("�۾� �������� �̸� : " + thA.getName());
		thA.start();
		
		ThreadB thB = new ThreadB();
		System.out.println("�۾� �������� �̸� : " + thB.getName());
		thB.start();
	}
}

class ThreadA extends Thread{
	 public ThreadA() {
		 setName("ThreadA");
	 }
	 
	 public void run() {
		 for(int i = 0; i < 2; i++) {
			 System.out.println(getName() + "�� ����� ����");
		 }
	 }
}

class ThreadB extends Thread{
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + "�� ����� ����");
		}
	}
}
