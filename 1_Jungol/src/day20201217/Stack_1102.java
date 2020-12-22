package day20201217;

import java.io.*;

public class Stack_1102 {
	static int[] stack = new int[101];
	static int top = -1;
	
	public static void main(String[] args) throws IOException
	{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			
			if(str.length > 1) {
				int data = Integer.parseInt(str[1]); 
				push(data);
			}
			else if(str[0].equals("o")) {
				if(size() == 0)
					System.out.println("empty");
				else {
					System.out.println(top());
					pop();
				}
			}
			else if(str[0].equals("c")) {
				System.out.println(size());
			}
		}
	}
	
	static int size() {
		int result;
		if(top < 0)	result = 0;
		else result = top + 1;
		
		return result;
	}
	
	static int top() {
		if(top < 0) return -1;
		return stack[top];
	}
	
	static void push(int data) {
		stack[++top] = data;
	}
	
	static void pop() {
		top--;
	}
	
	static boolean empty() {
		if(top < 0) return true;
		return false;
	}
}