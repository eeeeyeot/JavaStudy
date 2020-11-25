package day20201123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Disguise_3699
{
	static int cnt = 0;
	static TreeMap<String, String> map = new TreeMap<String,String>();
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			for(int j = 0; j < N; j++) {
				String[] arr = br.readLine().split(" ");
				map.put(arr[0], arr[1]);
			}
			countWear(new TreeMap<String, String>());
			System.out.println(cnt);
		}
	}
	
	static void countWear(TreeMap<String, String> tmp) {
		Map.Entry<String, String> tmpEntry = map.pollFirstEntry();
		tmp.put(tmpEntry.getKey(), tmpEntry.getValue());
		
		if(map.size() == 0) return;
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			boolean hasValue = false;
			
			for(Map.Entry<String, String> entry2 : tmp.entrySet()) {
				if(entry.getValue().equals(entry2.getValue())) {
					hasValue = true;
					break;
				}
			}
			
			if(!hasValue)
				countWear(tmp);
		}
		
		map.put(tmpEntry.getKey(), tmpEntry.getValue());
		
		cnt++;
	}
}
