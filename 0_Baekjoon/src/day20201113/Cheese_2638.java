package day20201113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cheese_2638 {
	static int n;
	static int m;
	static int[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}

		int time = 0;
		while (!isEmpty()) {
			time++;
			searchCheese(0, 0);
			arrangementArray();
			
		}

		System.out.println(time);
	}
	
	static int[][] dir = { 
			{0,  1}, 	//우
			{1,  0},	//하
			{0, -1},	//좌
			{-1, 0}		//상
	};
	
	static void searchCheese(int row, int col) {
		// 1. 현재 인덱스를 -2로 바꿔서 지나간 것을 표시
		arr[row][col] = -2;
		
		int result;
		// 2. 상하좌우 검사
		for(int i = 0; i < dir.length; i++) {
			if((result = checkNeighbor(row + dir[i][0], col + + dir[i][1])) != -1) {
				// 2.1 1을 발견하면 4로 바꿈
				if (result >= 1)
					arr[row + dir[i][0]][col + dir[i][1]]++;
				//2.2 값이 0인 인덱스로 탐색 진행
				else if (result == 0)
					searchCheese(row + dir[i][0], col + + dir[i][1]);
			}
		}
	}

	static int checkNeighbor(int row, int col) {
		if (row < 0 || row >= n || col < 0 || col >= m)
			return -1;

		return arr[row][col];
	}

	static boolean isEmpty() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 1) {
					return false;
				}
			}
		}
		return true;
	}

	static void arrangementArray() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] > 2 || arr[i][j] < -1)
					arr[i][j] = 0;
				
				if(arr[i][j] > 0)
					arr[i][j] = 1;
			}
		}
	}
}
