package Java5_ppt38;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetEx {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		String[] arr = {"korea", "china", "america"};
		
		for(int i = 0; i < arr.length; i++)
		{
			if(ts.add(arr[i]))
				System.out.println((i + 1) + " ��°" + arr[i] + "�߰� ����");
			else
				System.out.println((i + 1) + " ��°" + arr[i] + "�߰� ����");
		}
		
		System.out.println("Iterator�� ��ü ���� ��ȸ ----------------");
		Iterator<String> it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
			
		
	}
}
