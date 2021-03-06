package day20201113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cheese_1840 {
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
		int cnt = 0;
		while (!isEmpty()) {
			time++;
			cnt = countCheese();
			searchCheese(0, 0);
			arrangementArray();
		}

		System.out.println(time);
		System.out.println(cnt);
	}
	
	static int[][] dir = { 
			{0,  1}, 	//우
			{1,  0},	//하
			{0, -1},	//좌
			{-1, 0}		//상
	};
	
	static void searchCheese(int row, int col) {
		
		if(arr[row][col] == 1) arr[row][col] = 4;
		if(arr[row][col] > 0) return;
		
		// 1. 현재 인덱스를 3으로 바꿔서 지나간 것을 표시
		arr[row][col] = 3;
		
		// 2. 상하좌우 검사
		for(int i = 0; i < dir.length; i++) {
			if(checkNeighbor(row + dir[i][0], col + + dir[i][1]) != -1) {
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
	
	static int countCheese() {
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 1)
					cnt++;
			}
		}
		return cnt;
	}

	static void arrangementArray() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] != 1)
					arr[i][j] = 0;
			}
		}
	}
}
