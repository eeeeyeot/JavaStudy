package java6ppt40;

import java.awt.*;
import java.awt.event.*;

public class TextFieldTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("Login");
		f.setSize(400, 75);
		f.setLayout(new FlowLayout());
		
		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("Password : ", Label.RIGHT);
		
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		pwd.setEchoChar('*');
		
		Button btn = new Button("Login");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(id.getText().equals("master") &&
						pwd.getText().equals("1q2w3e4r")) {
					Label l = new Label("Login Success");
					f.add(l);
					
				}
			}
			
		});
		
		
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(btn);
		f.setVisible(true);
	}
}
