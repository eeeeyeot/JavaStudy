package day20201123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MessageDecowding_1880
{
	static String key;
	static String[] msg;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		key = br.readLine();
		msg = br.readLine().split("");
		
		for(int i = 0; i < msg.length; i++) {
			if(msg[i].equals(" ")) {
				System.out.print(msg[i]);
				continue;
			}
			msg[i] = String.format("%c", toOriginText(msg[i].charAt(0)));
			System.out.print(msg[i]);
		}
	}
	
	static char toOriginText(char c) {
		boolean isUpper = false;
		if(c >= 'A' && c <= 'Z') {
			isUpper = true;
			c = (char) (c + 32);
		}
		
		return isUpper ? (char)(key.charAt(c - 'a') - 32) : key.charAt(c - 'a');
	}
}
//a = A + 32