package AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest implements ActionListener
{
	private Frame f;
	private Button[] buttons = new Button[5];
	private String[] borders = {"North", "South", "West", "East", "Center"};

	public EventTest() {
		f = new Frame("event handler example");
		
		for(int i = 0 ; i < buttons.length; i++) {
			buttons[i] = new Button("Button" + (i + 1));
		}
	}
	
	public void startFrame() {
		for(Button b : buttons)
			b.addActionListener(this);
		
		for(int i = 0; i < buttons.length; i++) {
			f.add(buttons[i], borders[i]);
		}
		
		f.setSize(300, 300);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		System.out.println(s.substring(0, s.length() - 1) + " " +
				s.substring(s.length() - 1)+ " Click!");
		/*
		 * if(e.getActionCommand().equals("Button1"))
		 * System.out.println("Button 1 Click!");
		 * //~~
		 */
	}
	
	public static void main(String[] args)
	{
		EventTest g = new EventTest();
		g.startFrame();
	}
}
