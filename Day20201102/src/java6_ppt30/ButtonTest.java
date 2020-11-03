package java6_ppt30;

import java.awt.*;
import java.awt.event.*;

public class ButtonTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);
		
		Button b = new Button("확인");
		b.setSize(100, 50);
		b.setLocation(100, 75);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Button tmp = (Button)e.getSource();
				if(tmp.getLabel().equals("확인"))
					tmp.setLabel("취소");
				else
					tmp.setLabel("확인");
			}
		});
		
		f.add(b);
		f.setVisible(true);
		
	}
}
