package day20201112_userinput;

import java.awt.*;
import java.awt.event.*;

public class AWT extends WindowAdapter implements KeyListener
{
	Frame f = new Frame();
	Panel p1 = new Panel(new FlowLayout());
	Panel p2 = new Panel(new FlowLayout());
	Label l_search = new Label("Search");
	Label[] l_context = new Label[3];
	TextField tf = new TextField(10);
	TextField[] result = new TextField[3];
	Button searchButton = new Button("Search");
	
	public AWT() {
		f.setSize(400,200);
		f.setLayout(new BorderLayout());

		l_context[0] = new Label("empno", Label.RIGHT);
		l_context[1] = new Label("ename", Label.RIGHT);
		l_context[2] = new Label("sal", Label.RIGHT);
		
		for(int i = 0; i < result.length; i++) {
			result[i] = new TextField(10);
			result[i].setEditable(false);
			result[i].setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
			
			p2.add(l_context[i]);
			p2.add(result[i]);
		}
		
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				searchValue();
			}
			
		});
		
		tf.addKeyListener(this);
		
		p1.add(l_search);
		p1.add(tf, "Center");
		
		//p2.add(searchButton);
		
		f.add(p1, "North");
		f.add(p2, "Center");
		f.add(searchButton, "East");
		
		f.addWindowListener(this);
		f.setVisible(true);
	}
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER)
		{
			searchValue();
		}
	}
	
	void searchValue() {
		MemberTest.setInput(tf.getText());
		MemberTest.execute();
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void setTextArea(String empno, String ename, int sal) {
		result[0].setText(empno);
		result[1].setText(ename);
		result[2].setText(String.format("%d",sal));
	}

	public void keyReleased(KeyEvent e)	{ }
	public void keyTyped(KeyEvent e) { }
}
