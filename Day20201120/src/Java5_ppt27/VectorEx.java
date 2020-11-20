package Java5_ppt27;

import java.util.List;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("力格1", "郴侩1"));
		list.add(new Board("力格2", "郴侩2"));
		list.add(new Board("力格3", "郴侩3"));
		list.add(new Board("力格4", "郴侩4"));
		list.add(new Board("力格5", "郴侩5"));
		
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
