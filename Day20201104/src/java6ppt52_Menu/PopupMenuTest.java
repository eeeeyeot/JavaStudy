package java6ppt52_Menu;

import java.awt.*;
import java.awt.event.*;

public class PopupMenuTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("PopupMenu Test");
		f.setSize(300, 200);
		
		PopupMenu pMenu = new PopupMenu("Edit");
		MenuItem miCut = new MenuItem("Cut");
		MenuItem miCopy = new MenuItem("Copy");
		MenuItem miPaste = new MenuItem("Paste");
		
		pMenu.add(miCut);
		pMenu.add(miCopy);
		pMenu.add(miPaste);
		
		f.add(pMenu);
		f.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				if(me.getModifiers() == MouseEvent.BUTTON3_MASK)
					pMenu.show(f, me.getX(), me.getY());
			}
		});
		f.setVisible(true);
	}
}
