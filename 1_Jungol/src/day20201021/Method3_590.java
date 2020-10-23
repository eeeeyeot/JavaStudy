package day20201021;

import java.io.*;

public class Method3_590
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader	br	= new BufferedReader(new InputStreamReader(System.in));
		int[]			arr	= new int[Integer.parseInt(br.readLine())];

		while (!isFull(arr))
		{
			while (hasArrayProblem(arr))
			{
				increaseArray(arr);
			}

			printArray(arr);
			arr[arr.length - 1]++;
		}
	}

	static void printArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print((arr[i] + 1) + " ");
		}
		System.out.println();
	}

	static void increaseArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (i != 0 && arr[i] > 5)
			{
				arr[i - 1]++;
				for (int j = i; j < arr.length; j++)
				{
					arr[j] = arr[i - 1];
				}
			}
		}
	}

	static boolean hasArrayProblem(int[] arr)
	{
		boolean result = false;

		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > 5)
			{
				result = true;
				break;
			}
		}
		return result;
	}

	static boolean isFull(int[] arr)
	{
		boolean result = true;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] != 5)
			{
				result = false;

				break;
			}
		}
		//System.out.println();
		return result;
	}
}