package day20201020;

import java.io.*;
import java.util.*;

public class Stack_10828
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader	br		= new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer>	stack	= new Stack<Integer>();
		int				n		= Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());

			switch (st.nextToken())
			{
				case "push":
					stack.add(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					if (!stack.isEmpty())
						System.out.println(stack.pop());
					else
						System.out.println(-1);
					break;
				case "size":
					System.out.println(stack.size());
					break;
				case "empty":
					System.out.println(stack.isEmpty() ? "1" : "0");
					break;
				case "top":
					if (!stack.isEmpty())
						System.out.println(stack.peek());
					else
						System.out.println(-1);
					break;
			}
		}
	}
}
