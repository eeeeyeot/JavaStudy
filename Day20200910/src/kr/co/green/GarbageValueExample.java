package kr.co.green;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		
		for(int i = 0 ; i < 5; i ++) {
			var1++;
			var2++;
			
			System.out.println("var 1 : " + var1 + "\t" + "var2 : " + var2);
			
		}
		
		
		
		
		for(char var3 = 44032; var3 <= 55203; var3++)
			System.out.println(var3);
		
	}
}
