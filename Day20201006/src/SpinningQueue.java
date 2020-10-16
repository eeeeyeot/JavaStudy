import java.util.Scanner;

public class SpinningQueue
{
	public static void main(String[] args)
	{
		Scanner	sc		= new Scanner(System.in);
		Queue	queue	= new Queue();

		int		N		= sc.nextInt();
		int		M		= sc.nextInt();
		int[]	num		= new int[M];

		if (N > 0 && N <= 50)
		{
			if (M > 0 && M <= N)
			{
				queue.makeNodes(N);

				for (int i = 0; i < num.length; i++)
				{
					num[i] = sc.nextInt();
				}

				queue.findShortRoute(num);

				sc.close();
			}
		}
	}
}

class Queue
{
	private Node	head	= null;
	private int		cnt		= 0;

	public void deQueue()
	{
		head.next.previous = head.previous;
		head.previous.next = head.next;

		head = head.next;
	}

	private void moveLeft()
	{
		head = head.next;
		cnt++;
	}

	private void moveRight()
	{
		head = head.previous;
		cnt++;
	}

	public void makeNodes(int num)
	{
		Node tmp = null;
		for (int i = 0; i < num; i++)
		{
			if (head == null)
			{
				head = new Node();
			} else
			{
				tmp = findLastNode();
				tmp.next = new Node();
				tmp.next.previous = tmp;
				tmp.next.index = tmp.index + 1;

			}

			if (i == num - 1)
			{
				tmp.next.next = head;
				head.previous = tmp.next;
			}
		}
	}

	private Node findLastNode()
	{
		Node tmp = head;

		while (tmp.next != null)
		{
			tmp = tmp.next;
		}

		return tmp;
	}

	public void findShortRoute(int[] num)
	{
		Node	tmp;
		int		l_dist	= 0;
		int		r_dist	= 0;
		for (int i = 0; i < num.length; i++)
		{
			tmp = head;

			l_dist = leftDistance(tmp, num[i]);
			r_dist = rightDistance(tmp, num[i]);

			if (l_dist > r_dist)
			{
				for (int j = 0; j < r_dist; j++)
					moveRight();
				deQueue();
			} else
			{
				for (int j = 0; j < l_dist; j++)
					moveLeft();
				deQueue();
			}
		}

		System.out.println(cnt);
	}

	private int leftDistance(Node start, int last)
	{
		int		dist	= 0;
		Node	tmp		= start;
		while (true)
		{
			if (tmp.index == last)
				break;
			tmp = tmp.next;
			dist++;
		}
		
		return dist;
	}

	private int rightDistance(Node start, int last)
	{
		int		dist	= 0;
		Node	tmp		= start;
		while (true)
		{
			if (tmp.index == last)
				break;
			tmp = tmp.previous;
			dist++;
		}

		return dist;
	}
}


class Node
{
	Node	next		= null;
	Node	previous	= null;
	int		index		= 1;
}