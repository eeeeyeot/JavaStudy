package day20201029;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortWords_1181
{
	static void sortList(ArrayList<String> list, int i, int j) {
		String[] arr = new String[j - i];
		
		for(int k = i, l = 0; k < j; k++, l++) {
			arr[l] = list.get(k);
		}
		
		Arrays.sort(arr);
		
		for(int k = i, l = 0; k < j; k++, l++) {
			list.set(k, arr[l]);
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		//Vector<String> v_str = new Vector<String>();
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			if(!list.contains(s)) {
				list.add(s);
			}
		}
		
		list.sort(new Comparator<String>() {
			public int compare(String s1, String s2)
			{
				return Integer.compare(s1.length(), s2.length());
			}
		});
		
		for(int i = 0; i < list.size() - 1; i++) {
			int i_len = list.get(i).length();
			int j;
			for(j = i + 1; j < list.size(); j++) {
				int j_len = list.get(j).length();
				
				if(i_len != j_len) break;
			}
			
			sortList(list, i, j);
			
			i = j - 1;
		}

		for (int i = 0; i < list.size(); i++)
		{
			if (i != 0)
				sb.append('\n');
			sb.append(list.get(i));
		}
		System.out.print(sb);
	}
}
