package calculatorProject;

import java.awt.*;
import java.awt.event.*;
import java.util.StringTokenizer;

public class Calculator extends WindowAdapter
{
	static final String[] OPERATORS = {"+", "-", "*", "/", "="};
	Frame f = new Frame("계산기");
	TextField tf = new TextField("0");
	TextField buf = new TextField();
	Panel p = new Panel();
	Panel northP = new Panel();
	Button[] numbers = new Button[10];
	Button[] operators = new Button[5];
	Button clearBtn = new Button("C");
	boolean isFinish = false;
	
	
	void init() {
		f.addWindowListener(this);
		f.setLayout(new BorderLayout());
		f.setSize(350, 550);
		Font font = new Font("궁서체", Font.BOLD, 30);
		tf.setFont(font);
		tf.setEditable(false);
		tf.setFocusable(false);
		
		buf.setEditable(false);
		buf.setFocusable(false);
		
		p.setLayout(new GridLayout(0, 4));
		northP.setLayout(new GridLayout(2, 0));
		northP.add(buf);
		northP.add(tf);
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
		cal.init();
		
		cal.createOperatorBtn();
		cal.createNumberBtn();
		
		cal.f.add(cal.northP, "North");
		cal.f.add(cal.p, "Center");
		cal.f.setVisible(true);
	}
	
	void calculate() {
		StringTokenizer st = new StringTokenizer(buf.getText(), "+-*/=", true);
		int prevnum, num;
		prevnum = Integer.parseInt(st.nextToken());
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			num = Integer.parseInt(st.nextToken());
			switch (s)
			{
				case "+":
					prevnum += num;
					break;
				case "-":
					prevnum -= num;
					break;
				case "*":
					prevnum *= num;
					break;
				case "/":
					prevnum /= num;
					break;
				default:
					break;
			}
		}
		
		tf.setText(String.format("%d", prevnum));
	}

	boolean isOperator(String s) {
		if(s.length() == 0) return false;
		boolean result = false;
		for(int i = 0; i < 4; i++) {
			if(OPERATORS[i].charAt(0) == s.charAt(s.length() - 1)) {
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	void createOperatorBtn() {
		for(int i = 0; i < operators.length; i++) {
			operators[i] = new Button(OPERATORS[i]);
			operators[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String tmp = tf.getText();
					if(!e.getActionCommand().equals("=")) {
						// "="를 제외한 연산자가 2번 연속 들어오는 것을 방지
						boolean isContinuousOperator = isOperator(tmp);
						
						if(isContinuousOperator) return;
						
						if(isFinish) {
							buf.setText("");
						}
						buf.setText(buf.getText() + tf.getText() + e.getActionCommand());
						tf.setText(String.format("%d", 0));
						isFinish = false;
					}
					else {
						// 연산자가 앞에있는데 "="를 누를경우 방지
						// 0인데 "="를 누를 경우 방지
						if(isFinish)
							buf.setText("");
						
						if(!tmp.equals("0") && !isOperator(tmp)) {
							buf.setText(buf.getText() + tf.getText());
							calculate();
							isFinish = true;
						}
					}
				}
			});
		}
		
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				tf.setText("0");
				buf.setText("");
			}
		});
	}
	
	void createNumberBtn() {
		for(int i = 0 ; i < numbers.length; i++) {
			numbers[i] = new Button(String.format("%d", i));
			numbers[i].setSize(100, 50);
			numbers[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					if(isFinish) {
						buf.setText("");
						tf.setText("");
					}
					
					if(!tf.getText().equals("0"))
						tf.setText(tf.getText() + e.getActionCommand());
					else
						tf.setText(e.getActionCommand());
						
					isFinish = false;
				}
			});
		}
		
		addButtonsToPanel();
	}
	
	void addButtonsToPanel() {
		int k = 0;
		for(int i = 7; i >= 1; i -= 3) {
			for(int j = 0; j < 3; j++) {
				p.add(numbers[i + j]);
			}
			p.add(operators[k++]);
		}
		p.add(numbers[0]);
		p.add(clearBtn);
		p.add(operators[k+1]);
		p.add(operators[k]);
		
	}
	
}