package BaseBallAWT;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;


public class BaseballAWT
{
	public static void main(String[] args)
	{
		GameManager gm = new GameManager();
		gm.makeFrame();
	}
}

class GameManager extends WindowAdapter{
	Frame f = new Frame();
	Panel northPanel = new Panel();
	Panel southPanel = new Panel(); 
	TextField[] tf = new TextField[3];
	TextArea answerText = new TextArea();
	Button checkButton = new Button("check Answer");
	
	int[] answer = new int[3];
	int[] user = new int[3];
	Scanner sc = new Scanner(System.in);
	
	int strike = 0, ball = 0;
	
	GameManager() {
		setAnswer();
	}
	
	//AWT methods
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	void makeFrame() {
		f.setLayout(new BorderLayout());
		f.setSize(500, 300);
		northPanel.setLayout(new GridLayout());
		southPanel.setLayout(new GridLayout());
		
		northPanel.setFont(new Font("±Ã¼­Ã¼", Font.BOLD, 40));
		southPanel.setFont(new Font("±Ã¼­Ã¼", Font.BOLD, 20));
		
		answerText.setEditable(false);
		answerText.setFocusable(false);
		
		checkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				run();
			}
		});
		
		southPanel.add(answerText);
		southPanel.add(checkButton);
		
		for(int i = 0; i < tf.length; i++) {
			tf[i] = new TextField();
			northPanel.add(tf[i]);
		}
		
		f.addWindowListener(this);
		f.add(northPanel, "North");
		f.add(southPanel, "Center");
		f.setVisible(true);
		
		printAnswer();
	}
	
	
	//game methods
	void run() {
		reset();
		getUserInput();
		if(checkCorrect()) { 
			userWin();
			return;
		}
		printResult();
		clearTextField();
	}
	
	void reset() {
		strike = 0;
		ball = 0;
		
	}
	
	void clearTextField() {
		for(int i = 0; i < user.length; i++) {
			tf[i].setText("");
		}
	}
	
	void printResult() {
		
		for(int i = 0; i < user.length; i++) {
			answerText.append(user[i] + " ");
		}
		answerText.append("\n");
		
		if(strike != 0) 
		{
			System.out.print(strike + " strike   ");
			answerText.append(strike + " strike   ");
		}
		if(ball != 0)
		{
			System.out.print(ball + " ball");
			answerText.append(ball + " ball");
		}
		
		if(strike == 0 && ball == 0) {
			System.out.print("None...");
			answerText.append("None...");
		}
		answerText.append("\n");
		System.out.println();
	}
	
	void userWin() {
		System.out.println("User Win!");
		answerText.append("User Win!");
	}
	
	boolean checkCorrect() {
		boolean result = false;
		
		for(int i = 0; i < answer.length; i++) {
			for(int j = 0; j < user.length; j++) {
				if(answer[i] == user[j]) {
					if(i == j)
						strike++;
					else
						ball++;
					
					break;
				}
			}
		}
		
		if(strike == 3)
			result = true;
		
		return result;
	}
	
	void getUserInput() {
		for(int i = 0; i < user.length; i++) {
			user[i] = Integer.parseInt(tf[i].getText());
		}
	}
	
	void setAnswer() {
		for(int i = 0; i < answer.length; i++) {
			answer[i] = getRandom();
		}
	}
	
	int getRandom() {
		int result = 0;
		while(true) {
			boolean isOverlap = false;
			result = (int)(Math.random() * 9) + 1;
			
			for(int i = 0; i < answer.length; i++) {
				if(answer[i] == result)
				{
					isOverlap = true;
					break;
				}
			}
			
			if(!isOverlap)
				break;
		}
		return result;
	}
	

	void printAnswer() {
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println();
	}
}