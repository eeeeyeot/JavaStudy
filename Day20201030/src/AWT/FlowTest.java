package AWT;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowTest
{
	private Frame frame;
	private Button btn1, btn2, btn3;
	
	public FlowTest() {
		frame = new Frame("FlowLayout example");
		btn1 = new Button("확인");
		btn2 = new Button("열기");
		btn3 = new Button("닫기");
	}
	
	void startFrame() {
		frame.setLayout(new FlowLayout());
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		FlowTest flow = new FlowTest();
		flow.startFrame();
	}
}
