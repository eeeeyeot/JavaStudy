import java.util.Scanner;

public class Fibonacci
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int[][] cnt = new int[41][2];
		cnt[0][0] = 1;
		cnt[1][1] = 1;
		
		for(int i = 2 ; i < cnt.length; i++){
			for(int j = 0; j < cnt[i].length; j++) {
				cnt[i][j] = cnt[i-1][j] + cnt[i-2][j];
			}
		}
		
		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			System.out.println(cnt[a][0] + " " + cnt[a][1]);
			
		}
			
		sc.close();
	}
	
	/*
	 * static int[] check = new int[41];
	 * public static void main(String[] args)
	 * {
	 * Scanner sc = new Scanner(System.in);
	 * int n = 0;
	 * int num = sc.nextInt();
	 * int[][] cnt = new int[41][2];
	 * cnt[0][0] = 1; cnt[0][1] = 0; cnt[1][0] = 0; cnt[1][1] = 1;
	 * for(int i = 0; i < num; i++) {
	 * n = sc.nextInt();
	 * Fibo(n);
	 * for(int j = 2; j <= n; j++) {
	 * cnt[j][0] = cnt[j-1][0] + cnt[j-2][0];
	 * cnt[j][1] = cnt[j-1][1] + cnt[j-2][1];
	 * }
	 * System.out.println(cnt[n][0] + " " + cnt[n][1]);
	 * }
	 * sc.close();
	 * }
	 * static int Fibo(int n) {
	 * if(n == 0)
	 * {
	 * return 0;
	 * }
	 * else if(n == 1) {
	 * return 1;
	 * }
	 * if(check[n] != 0) {
	 * return check[n];
	 * }
	 * else {
	 * return check[n] = Fibo(n-1) + Fibo(n - 2);
	 * }
	 * }
	 */
}
