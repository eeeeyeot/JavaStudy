package day20201012;

//import java.util.ArrayList;
import java.util.Scanner;

public class WordStudy_1157
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		
		int[] cnt = new int[26];
		int max = 0;
		char result = '?';
		
		for(int i = 0; i < str.length(); i++) {
			cnt[str.charAt(i) - 65]++;
			
			if(max < cnt[str.charAt(i) - 65]) {
				max = cnt[str.charAt(i) - 65];
				result = str.charAt(i);
			}
			else if(max == cnt[str.charAt(i) - 65])
				result = '?';
		}
		
		System.out.println(result);
		
		
		sc.close();
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * String[] str = sc.next().toUpperCase().split("");
		 * ArrayList<StringInfo> sList = new ArrayList<StringInfo>();
		 * for(int i = 0; i < str.length; i++) {
		 * boolean hasIndex = false;
		 * for(StringInfo s : sList) {
		 * if(s.str.equals(str[i])) {
		 * s.count++;
		 * hasIndex = true;
		 * }
		 * }
		 * if(!hasIndex) {
		 * StringInfo tmp = new StringInfo();
		 * tmp.str = str[i];
		 * sList.add(tmp);
		 * }
		 * }
		 * int max = 0;
		 * int idx = 0;
		 * int cnt = 0;
		 * for(StringInfo s : sList) {
		 * if(s.count > max) {
		 * max = s.count;
		 * idx = cnt;
		 * }
		 * cnt++;
		 * }
		 * for(int i = 0; i < sList.size(); i++) {
		 * if(i != idx) {
		 * if(sList.get(i).count == max) {
		 * System.out.println("?");
		 * System.exit(0);
		 * }
		 * }
		 * }
		 * System.out.println(sList.get(idx).str);
		 * sc.close();
		 */
	}
}
/*
	 * class StringInfo{
	 * int count = 0;
	 * String str = "";
	 * }
	 */