package day20201015;

import java.io.*;

public class Stack_10828
{
	static int[] stack = new int[10000];
	static int last = -1;
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			
			if(str[0].equals("push")) {
				push(Integer.parseInt(str[1]));
			}
			else if(str[0].equals("pop")) {
				System.out.println(pop());
			}
			else if(str[0].equals("size")) {
				System.out.println(size());
			}
			else if(str[0].equals("empty")) {
				System.out.println(empty());
			}
			else if(str[0].equals("top")) {
				System.out.println(top());
			}
			else
				System.out.println("ERROR");
		}
		
		br.close();
	}
	
	
	static void push(int num)
	{
		stack[++last] = num;
	}
	
	static int pop()
	{
		int result = 0;
		if(last == -1) return -1;
		
		result = stack[last--];
		
		return result;
	}
	
	static int size()
	{
		int result = 0;
		if(last == -1) return 0;

		result = last + 1;
		
		return result;
	}
	
	static int empty() {
		int result = 0;
		if(last == -1) result = 1;
		
		return result;
	}
	
	static int top() {
		int result = 0;
		if(last == -1) return -1;
		
		result = stack[last];
	
		return result;
	}
}