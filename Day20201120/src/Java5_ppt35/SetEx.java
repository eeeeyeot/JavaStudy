package Java5_ppt35;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Service/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		printElement(set);
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		printElement(set);
		
		set.clear();
		
		if(set.isEmpty())
			System.out.println("ºñ¾î ÀÖÀ½");
	}
	
	static void printElement(Set<String> set) {
		int size = set.size();
		System.out.println("ÃÑ °´Ã¼¼ö : " + size);
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext())
		{
			String element = iter.next();
			System.out.println("\t" + element);
		}
	}
}
