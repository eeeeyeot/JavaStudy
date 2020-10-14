package kr.co.green;

public class ArrayCopyEx
{
	public static void main(String[] args)
	{
		int[] oldIntArr = {1, 2, 3};
		int[] newIntArr = new int[5];
		
		for(int i = 0; i < oldIntArr.length; i++) {
			newIntArr[i] = oldIntArr[i];
		}
		
		for(int n : newIntArr) {
			System.out.print(n + " ");
		}
	}
}
