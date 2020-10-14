package day20201014;

import java.util.Scanner;

public class CharTriangle1_1138
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				
			}
		}
		sc.close();
	}
}

//5
// @  @  @  @  A
// @  @  @  B  F
// @  @  C  G  J
// @  D  H  K  M
// E  I  L  N  O

// @  @  @  @ 65
// @  @  @ 66 70
// @  @ 67 71 74
// @ 68 72 75 77
//69 73 76 78 79

// 0  0  0  0  0
// 0  0  0  0  4
// 0  0  0  4  3
// 0  0  4  3  2
// 0  4  3  2  1