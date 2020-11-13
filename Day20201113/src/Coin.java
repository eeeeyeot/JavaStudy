import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coin
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input Coin's side..");
		int side = Integer.parseInt(br.readLine());
		
		System.out.print("Input Coin's number..");
		int number = Integer.parseInt(br.readLine());

		int[] arr = new int[number];
		
		flipCoin(arr, side);
	}
	
	static void flipCoin(int[] arr, int side) {
		printArray(arr);
		
		boolean isFull = isFull(arr, side);
		
		if(isFull)
			return;
		
		arr[arr.length - 1]++;
		
		for(int i = arr.length - 1; i > 0; i--) {
			if(arr[i] >= side) {
				arr[i - 1]++;
				for(int j = i; j < arr.length; j++) {
					arr[j] = 0;
				}
			}
		}
		
		flipCoin(arr, side);
	}
	
	static boolean isFull(int[] arr, int side) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != side - 1) {
				return false;
			}
		}
		
		return true;
	}
	
	static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
