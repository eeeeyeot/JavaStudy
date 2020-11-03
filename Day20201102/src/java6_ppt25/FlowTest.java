package java6_ppt25;

import java.awt.*;
import java.awt.event.*;

public class FlowTest extends WindowAdapter
{
	private Frame frame;
	private Button[] btn = new Button[3];
	private String[] sArr = {"Ok", "Open", "Close"};
	
	public FlowTest() {
		frame = new Frame("adapter example");
		for(int i = 0; i < btn.length; i++) {
			btn[i] = new Button(sArr[i]);
		}
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void startFrame() {
		frame.addWindowListener(this);
		frame.setLayout(new FlowLayout());
		
		for(Button b : btn)
			frame.add(b);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		FlowTest g = new FlowTest();
		g.startFrame();
	}
}
