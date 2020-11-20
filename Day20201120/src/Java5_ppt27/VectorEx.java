package Java5_ppt27;

import java.util.List;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("����1", "����1"));
		list.add(new Board("����2", "����2"));
		list.add(new Board("����3", "����3"));
		list.add(new Board("����4", "����4"));
		list.add(new Board("����5", "����5"));
		
		list.remove(2);
		list.remove(3);
		
		for(Board b : list)
			System.out.println(b);
	}
}

class Board {
	String subject;
	String content;
	
	public Board(String subject, String content)
	{
		this.subject = subject;
		this.content = content;
	}
	
	public String toString() {
		return subject + "\t" + content;
	}
}
