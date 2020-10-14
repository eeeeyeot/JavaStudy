package kr.co.green;

public class IfNestedExample
{

	public static void main(String[] args)
	{
		int score = (int)(Math.random() * 41) + 60;
		
		/*
		 * do {
		 * score = (int)(Math.random() * 21) + 80;
		 * }while(score != 80 && score != 100);
		 */
		String grade;
		System.out.println("점수 : " + score);
		if(score >= 90) {
			if(score >= 95)
				grade = "A+";
			else 
				grade = "A";
		}
		else if(score >= 80) {
			if(score >= 85) 
				grade = "B+";
			else
				grade = "B";
		}
		else if(score >= 70) {
			if(score >= 75) 
				grade = "C+";
			else
				grade = "C";
		}
		else {
			if(score >= 65) 
				grade = "D+";
			else
				grade = "D";
		}
		System.out.println("학점 : " + grade);
	}

}
