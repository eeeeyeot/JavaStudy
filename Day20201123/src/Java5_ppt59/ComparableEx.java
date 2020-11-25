package Java5_ppt59;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableEx
{
	public static void main(String[] args)
	{
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		Iterator<Person> it = treeSet.iterator();
		while(it.hasNext())
		{
			Person p = it.next();
			System.out.println(p);
		}
	}
}
