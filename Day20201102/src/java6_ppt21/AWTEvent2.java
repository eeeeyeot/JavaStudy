package java6_ppt21;

import java.awt.*;
import java.awt.event.*;

public class AWTEvent2
{
	private Frame frame;
	private Button[] btn = new Button[5];
	private String[] sArr = {"North", "South", "West", "East", "Center"};
	
	public AWTEvent2() {
		frame = new Frame("event handler example");
		for(int i = 0; i < btn.length; i++)
			btn[i] = new Button("Button" + (i + 1));
	}
	
	public void startFrame() {
		for(int i = 0; i < btn.length; i++) {
			btn[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					String s = e.getActionCommand();
					System.out.println(s.substring(0, s.length()) +	" click!");
				}
			});
		}
		
		for(int i = 0; i < btn.length; i++)
			frame.add(btn[i], sArr[i]);
		
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		AWTEvent2 border = new AWTEvent2();
		border.startFrame();
	}
}
