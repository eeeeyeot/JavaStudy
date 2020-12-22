package day20201217;

import java.io.*;

public class Queue_1697 
{
	static int[] queue = new int[101];
	static int front = 0;
	static int rear = 0;
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			
			if(str.length > 1) 
			{
				int data = Integer.parseInt(str[1]);
				push(data);
			}
			else if(str[0].equals("o")) 
			{
				if(empty()) 
				{
					System.out.println("empty");
				}
				else 
				{
					System.out.println(front());
					pop();
				}
			}
			else if(str[0].equals("c")) 
			{
				System.out.println(size());
			}
		}
	}
	
	
	static boolean empty() {
		if((rear - front) == 0)
			return true;
		
		return false;
	}
	
	static int size() {
		return rear - front;
	}
	
	static int front() {
		return queue[front];
	}
	
	static int back() {
		return queue[rear];
	}
	
	static void push(int data) {
		queue[rear++] = data;
	}
	
	static void pop() {
		if((rear - front) == 0)
			return;
		front++;
	}
}
