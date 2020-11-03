package java6_ppt27;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FlowTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("Login");
		f.setSize(500, 200);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		f.setLocation((screenSize.width / 2) - (f.getWidth() / 2), 
				(screenSize.height / 2) - (f.getHeight() / 2));
		f.setVisible(true);
		f.setResizable(false);
	}
}
