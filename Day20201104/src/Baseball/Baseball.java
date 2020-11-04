package Baseball;

import java.util.Scanner;

public class Baseball
{
	public static void main(String[] args)
	{
		GameManager gm = new GameManager();
		gm.run();
	}
}

class GameManager {
	int[] answer = new int[3];
	int[] user = new int[3];
	Scanner sc = new Scanner(System.in);
	
	int strike = 0, ball = 0;
	
	GameManager() 
	{
		setAnswer();
	}
	
	
	
	void run() {
		while(true) {
			reset();
			getUserInput();
			if(checkCorrect()) break;
			printResult();
		}
		userWin();
	}
	
	void reset() {
		strike = 0;
		ball = 0;
	}
	
	void printResult() {
		if(strike != 0) 
			System.out.print(strike + " strike   ");
		if(ball != 0)
			System.out.print(ball + " ball");
		
		if(strike == 0 && ball == 0)
			System.out.print("None...");
		
		System.out.println();
	}
	
	void userWin() {
		System.out.println("User Win!");
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
			user[i] = sc.nextInt();
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
}