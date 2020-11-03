package kr.co.green;

import java.util.Scanner;

public class FindFraction
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int cnt = 1;
		int i = 0, j = 0;
		boolean reverse = false;
		
		while(cnt != input) {
			if(i == 0 && j == 0) {
				j++;
				cnt++;
				continue;
			}
			
			//끝에 도달시
			if(i - 1 < 0 || j - 1 < 0) {
				reverse = !reverse;
				//위쪽 끝일 때 한 칸 오른쪽으로
				if(j > 1 && i == 0) {
					j++;
					cnt++;
				}
				//왼쪽 끝일 때 한 칸 아래로
				else if(i > 0 && j == 0) {
					i++;
					cnt++;
				}
				
				if(cnt == input)
					break;
			}
			
			//진행 방향으로 증가
			if(reverse) {
				j--;
				i++;
			}
			else {
				j++;
				i--;
			}
			
			cnt++;
		}
		
		System.out.println((i + 1) + "/" + (j + 1));
		
		sc.close();
	}
}
