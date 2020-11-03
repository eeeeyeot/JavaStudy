package AWT;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		System.out.println(s.substring(0, s.length() - 1) + " " +
				s.substring(s.length() - 1)+ " Click!");
	}
	
}
