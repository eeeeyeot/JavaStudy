package java6_ppt20;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderTest
{
	private Frame f;
	private Button[] btn = new Button[5];
	private String[] sArr = {"North", "South", "West", "East", "Center"};
	
	public BorderTest() {
		f = new Frame("event handler example");
		for(int i = 0; i < btn.length; i++) {
			btn[i] = new Button("Button" + (i + 1));
		}
	}
	
	public class InnerHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String s = e.getActionCommand();
			System.out.println(s.substring(0, s.length() - 1) + " " + 
			s.substring(s.length() - 1) + " Click!");
		}
	}
	
	public void startFrame() {
		for(Button b : btn)
			b.addActionListener(new InnerHandler());
		
		for(int i = 0; i < btn.length; i++)
			f.add(btn[i], sArr[i]);
		
		f.setSize(300, 300);
		f.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		BorderTest border = new BorderTest();
		border.startFrame();
	}
}
