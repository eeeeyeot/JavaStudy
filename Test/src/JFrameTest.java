import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameTest
{
	static JFrame f = new JFrame();
	static JButton btn = new JButton();
	
	public static void main(String[] args)
	{
		f.add(btn);
		f.setSize(200, 200);
		f.setVisible(true);
	}
}
