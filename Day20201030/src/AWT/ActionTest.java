package AWT;

import java.awt.Button;
import java.awt.Frame;

public class ActionTest
{
	private Frame f;
	private Button[] buttons = new Button[5];
	private String[] borders = {"North", "South", "West", "East", "Center"};

	public ActionTest() {
		f = new Frame("event handler example2");
		
		for(int i = 0 ; i < buttons.length; i++) {
			buttons[i] = new Button("Button" + (i + 1));
		}
	}
	
	public void startFrame() {
		for(Button b : buttons)
			b.addActionListener(new ActionHandler());
		
		for(int i = 0; i < buttons.length; i++) {
			f.add(buttons[i], borders[i]);
		}
		
		f.setSize(300, 300);
		f.setVisible(true);
	}
	
	
	public static void main(String[] args)
	{
		ActionTest a = new ActionTest();
		a.startFrame();
	}
}
