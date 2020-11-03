package AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;

public class GridTest
{
	private Frame frame;
	private Button b1, b2, b3, b4, b5, b6;
	private TextField tf1, tf2, tf3;
	
	public GridTest() {
		frame = new Frame("GridLayout example");
		b1 = new Button("button 1");
		b2 = new Button("button 2");
		b3 = new Button("button 3");
		b4 = new Button("button 4");
		b5 = new Button("button 5");
		b6 = new Button("button 6");
		
		tf1 = new TextField("Input Text 1");
		tf2 = new TextField("Input Text 2");
		tf3 = new TextField("Input Text 3");
	}
	
	public void startFrame() {
		frame.setLayout(new GridLayout(3, 0));
		frame.add(b1);
		frame.add(tf1);
		frame.add(b4);
		
		frame.add(b2);
		frame.add(tf2);
		frame.add(b5);
		
		frame.add(b3);
		frame.add(tf3);
		frame.add(b6);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		GridTest flow = new GridTest();
		flow.startFrame();
	}
}


