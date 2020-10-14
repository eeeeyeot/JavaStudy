import java.util.Scanner;

public class SpinningQueue2
{
	static int head = 0;
	static int cnt = 0;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] queue = new int[N];
		int[] num = new int[M];
		
		for(int i = 0; i < N; i++) {
			queue[i] = i + 1;
		}
		
		for(int i = 0; i < M; i++) {
			num[i] = sc.nextInt();
		}
		
		calculateDistance(queue, num);
		
		
		
		sc.close();
	}
	
	static void moveLeft(int[] queue) {
		head++;
		if(head >= queue.length) {
			head = 0;
		}
	}
	
	static void moveRight(int[] queue) {
		head--;
		if(head < 0)
		{
			head = queue.length - 1;
		}
	}
	
	static int calculateDistance(int[] queue, int[] num) {
		
		
		return 0;
	}
	
	static int calLeftDist(int[] queue, int last) {
		int cnt = 0;
		
		return cnt;
	}
	
	static int calRightDist(int[] queue, int last) {
		int cnt = 0;
		
		return cnt;
	}
}
