package day20201020;

import java.util.Scanner;

public class Loop3_148
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n * 2 - 1; i++) {
			if(i < n)
				for(int j = 0; j < i + 1; j++) {
					System.out.print("# ");
				}
			else
				for(int j = 0; j < n; j++) {
					if(j >= n - ((n * 2 - 1) - i))
						System.out.print("# ");
					else
						System.out.print("  ");
				}
			
			System.out.println();
		}
		
		sc.close();
	}
}

//5
//#			0
//# #		1
//# # #		2
//# # # #	3
//# # # # #	4
//  # # # # 5
//    # # # 6
//      # # 7
//        # 8