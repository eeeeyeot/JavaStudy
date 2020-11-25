package jungol;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Disguise_3699 {
	static int cnt = 0;
	public static void main(String[] args) throws IOException
	{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			TreeMap<String, String> map = new TreeMap<String, String>();
			int N = Integer.parseInt(br.readLine());
			cnt = 0;
			
			for(int j = 0; j < N; j++) {
				String[] arr = br.readLine().split(" ");
				map.put(arr[0], arr[1]);
			}
			
			func(new TreeMap<String, String>(), map);
			System.out.println(cnt + N - 1);
		}
	}
	
	public static void func(TreeMap<String, String> tmp, TreeMap<String, String> map) {
		if(map.size() == 0) return;

		Map.Entry<String, String> entry = map.pollFirstEntry();
		if(tmp.containsValue(entry.getValue()))
			return;
		tmp.put(entry.getKey(), entry.getValue());
		
		for(int i = 0; i < map.size(); i++) {
			func(new TreeMap<String, String>(tmp), new TreeMap<String, String>(map));
		}
		
		cnt++;
	}
}
