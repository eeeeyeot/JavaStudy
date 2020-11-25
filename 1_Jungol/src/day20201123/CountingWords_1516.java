package day20201123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class CountingWords_1516
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<TreeMap<String, Integer>>	list = new ArrayList<TreeMap<String, Integer>>();
		
		String inp = "";
		
		while(true) {
			if((inp = br.readLine()).equals("END"))
				break;
			TreeMap<String, Integer> map = new TreeMap<String, Integer>();
			
			String[] arr = inp.split(" ");
			for(int i = 0; i < arr.length; i++) {
				if(map.containsKey(arr[i])) {
					map.put(arr[i], map.get(arr[i]) + 1);
				}
				else {
					map.put(arr[i], 1);
				}
			}
			list.add(map);
		}
		
		for(int i = 0; i < list.size(); i++) {
			for (Map.Entry<String, Integer> entry : list.get(i).entrySet())
			{
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}
}
