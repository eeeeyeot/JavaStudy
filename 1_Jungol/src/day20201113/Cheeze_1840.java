package day20201113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cheeze_1840
{
	static int n;
	static int m;
	static int[][] arr;
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		/*
		 * while(isEmpty()) {
		 * }
		 */
		searchCheeze(0, 0);
		print();
	}

	static void searchCheeze(int row, int col) {
		//1.	Ž���� ������ return
		//1.1	�����¿찡 ��� ��������
		if(isStuck(row,col)) return;
		
		//2.	���� �ε����� 3���� �ٲ㼭 ������ ���� ǥ��
		arr[row][col] = 3;
		
		//3.	�����¿� �˻�
		//��
		int result;
		if((result = isoktoGo(row - 1, col)) != -1) {
			//3.1	1�� �߰��ϸ� 4�� �ٲ�
			if(result == 1) arr[row - 1][col] = 4;
			//3.2	���� 0�� �ε����� Ž�� ����
			else if(result == 0)
				searchCheeze(row - 1, col);
		}
		//��
		if ((result = isoktoGo(row + 1, col)) != -1)
		{
			//3.1	1�� �߰��ϸ� 4�� �ٲ�
			if(result == 1) arr[row + 1][col] = 4;
			//3.2	���� 0�� �ε����� Ž�� ����
			else if(result == 0)
				searchCheeze(row + 1, col);
		} 
		//��
		if((result = isoktoGo(row, col - 1)) != -1)
		{
			//3.1	1�� �߰��ϸ� 4�� �ٲ�
			if(result == 1) arr[row][col - 1] = 4;
			//3.2	���� 0�� �ε����� Ž�� ����
			else if(result == 0)
				searchCheeze(row, col - 1);
		} 
		//��
		if ((result = isoktoGo(row, col + 1)) != -1)
		{
			//3.1	1�� �߰��ϸ� 4�� �ٲ�
			if(result == 1) arr[row][col + 1] = 4;
			//3.2	���� 0�� �ε����� Ž�� ����
			else if(result == 0)
				searchCheeze(row, col + 1);
		}
	}
	
	static int isoktoGo(int row, int col) {
		if(row < 0 || row >= n || col < 0 || col >= n)
			return -1;
		
		return arr[row][col];
	}
	
	static boolean isStuck(int row, int col) {
		if(isoktoGo(row - 1, col) != 0 &&
				isoktoGo(row + 1, col) != 0 &&
				isoktoGo(row, col - 1) != 0 &&
				isoktoGo(row, col + 1) != 0)
			return true;
			
		return false;
	}
	
	static boolean isEmpty() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(arr[i][j] == 1) {
					return false;
				}
			}
		}
		return true;
	}
	
	static void print() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
